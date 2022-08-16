function create_scroll() {
    const auto_complete_scrolling = document.querySelector('.suggest_list.lg');

    if(auto_complete_scrolling.offsetHeight > 425) {
        auto_complete_scrolling.style = 'overflow-y: scroll; height:420px;' 
    } else {
        auto_complete_scrolling.style = '';
    }
}


async function searchingFromServer(keyword) {
    try {
        const resp = await fetch('/search/' + keyword);
        const result = await resp.json();
        return await result;
    } catch (error) {
        console.log(error);
    }
}

document.querySelector('.input_search.show_placeholder_on_focus').addEventListener('input', (e)=> {
    const keyword = document.querySelector('.input_search.show_placeholder_on_focus').value;

    if(keyword.length > 0) {
        document.querySelector('.btn_search_delete').style.display = 'block';

        searchingFromServer(keyword).then(result => {
            if(result.searchedBrandList.length > 0) {
                let html = '';
                let the_length = result.searchedBrandList.length < 3 ? result.searchedBrandList.length : 3;
                
                for(let i = 0; i < the_length; i++) {
                    html += `
                        <div data-v-db6f0438="" data-v-589881b0="" class="suggest_title_area" data-v-1f7c6d3f="">
                            <p data-v-db6f0438="" class="suggest_title"> ${result.searchedBrandList[i].englishName}
                                <span data-v-db6f0438="" class="suggest_type">BRAND</span>
                            </p>
                            <a data-v-db6f0438="" href="/product/list??pageNo=1&qty=12&shoe_brand=${result.searchedBrandList[i].identityNumber}" class="more_link">
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-chevron-right" viewBox="0 0 16 16">
                                    <path fill-rule="evenodd" d="M4.646 1.646a.5.5 0 0 1 .708 0l6 6a.5.5 0 0 1 0 .708l-6 6a.5.5 0 0 1-.708-.708L10.293 8 4.646 2.354a.5.5 0 0 1 0-.708z"/>
                                </svg>
                            </a>
                        </div>
                    `
                }
                document.querySelector('div.suggest_area').innerHTML = html;
            }

            document.querySelector('div.suggest_area').innerHTML += '<div data-v-2741e9de="" data-v-589881b0="" class="suggest_list lg" data-v-1f7c6d3f="">';

            if(result.searchedProductList.length > 0) {
                let html = '';
                
                result.searchedProductList.forEach((idx) => {
                    html += `
                        <div data-v-2741e9de="" class="suggest_item">
                            <a data-v-2741e9de="" href="/items/detail?pno=${idx.identityNumber}" class="suggest_link">
                                <div data-v-2741e9de="" class="suggest_thumb" style="background-color: rgb(246, 238, 237);">
                                    <img data-v-2741e9de="" src="${idx.imagePath}">
                                </div>
                                <div data-v-2741e9de="" class="suggest_info">
                                    <p data-v-2741e9de="" class="model_title">${idx.englishName}</p>
                                    <p data-v-2741e9de="" class="model_sub_info">${idx.koreanName}</p>
                                </div>
                            </a>
                        </div>
                    `;
                });
                document.querySelector('.suggest_list.lg').innerHTML = html;
            }
            create_scroll();
        });
    } else {
        document.querySelector('div.suggest_area').innerHTML = '';
        document.querySelector('.btn_search_delete').style.display = 'none';
    }
});

document.querySelector('.btn_layer_close').addEventListener('click', (e)=> {
    e.preventDefault();
    
    document.querySelector('.input_search.show_placeholder_on_focus').value = '';
    document.querySelector('.btn_search_delete').style.display = 'none';
    document.querySelector('div.suggest_area').innerHTML = '';

    const searching_table = document.getElementById('display-modal');
    if(searching_table.style.display == 'block') searching_table.style.display = 'none';
});

document.querySelector('.btn_search_delete').addEventListener('click', (e)=> {
    e.preventDefault();

    document.querySelector('.input_search.show_placeholder_on_focus').value = '';
    document.querySelector('div.suggest_area').innerHTML = '';
    document.querySelector('.btn_search_delete').style.display = 'none';
});

document.querySelector('.input_search.show_placeholder_on_focus').addEventListener('keydown', (e)=> {
    const items = document.querySelector('.suggest_list.lg');
    
    if(e.code === 'Enter' && items.children.length > 0) {
        location.href = items.children[0].querySelector('a').href;
    }
});