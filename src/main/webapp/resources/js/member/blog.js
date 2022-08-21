/*
* Author : Mr.Doe
* 블로그 메뉴탭 선택시 컨텐츠 시작
*/

let page = 1;
async function getMyblogPageFromServer() {
    try {
        const url = await fetch(`/blog/page`);
        const result = await url.text();
        return result;
    } catch (error) {
        console.log(error);
    }
}

document.getElementById('blog').addEventListener('click', (e)=> {
    e.preventDefault();
    const content = document.querySelector('.content_area');

    getMyblogPageFromServer(session).then(result => {
        content.innerHTML = result;
    });

    setTimeout(function() {
        posting_img(session);
    }, 10);
});

async function get_posting_image_from_server(email) {
    try {
        const url = '/blog/page/post-img';
        const config = {
            method : 'POST',
            headers : { 'Content-Type' : 'application/json' },
            body : JSON.stringify({
                    'ownEmail' : `${email}`,
                    'page' : page
                    })
        }
        const resp = await fetch(url, config); 
        const result = await resp.json();
        return result;
    } catch (error) {
        console.log(error);
    }
}

function empty_posting() {
    const html = `
                <div data-v-45fa91b1="" data-v-f31ad0b8="" class="social_feeds_empty top_line">
                    <div data-v-45fa91b1="" class="empty_box">.
                        <svg xmlns="http://www.w3.org/2000/svg" width="100" height="100" fill="currentColor" class="bi bi-camera" viewBox="0 0 16 16" style="color: rgba(34,34,34,.5);">
                            <path d="M15 12a1 1 0 0 1-1 1H2a1 1 0 0 1-1-1V6a1 1 0 0 1 1-1h1.172a3 3 0 0 0 2.12-.879l.83-.828A1 1 0 0 1 6.827 3h2.344a1 1 0 0 1 .707.293l.828.828A3 3 0 0 0 12.828 5H14a1 1 0 0 1 1 1v6zM2 4a2 2 0 0 0-2 2v6a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V6a2 2 0 0 0-2-2h-1.172a2 2 0 0 1-1.414-.586l-.828-.828A2 2 0 0 0 9.172 2H6.828a2 2 0 0 0-1.414.586l-.828.828A2 2 0 0 1 3.172 4H2z"/>
                            <path d="M8 11a2.5 2.5 0 1 1 0-5 2.5 2.5 0 0 1 0 5zm0 1a3.5 3.5 0 1 0 0-7 3.5 3.5 0 0 0 0 7zM3 6.5a.5.5 0 1 1-1 0 .5.5 0 0 1 1 0z"/>
                        </svg>
                        <strong data-v-45fa91b1="" class="empty_title">게시물 없음</strong>
                        <p data-v-45fa91b1="" class="empty_txt">앱에서 사진을 공유하면 내 프로필에 표시됩니다.</p>
                        <input type="file" id="fileUpload" accept="image/*" hidden>
                    </div>
                </div>
                `;

    document.querySelector('.content_area .masonry_posts').innerHTML = html;
}

function have_posting(result) {
    const table = document.querySelector('.content .masonry_posts');
    let table_gap = 715, top_gap = 230, left_gap = 230;
    let table_height = 0, top = 0, left = 0;
    let html = '';

    result.forEach((idx) => {
        console.log(idx);
        if(table.offsetWidth <= left) {
            left = 0;
            top += top_gap;
        }

        html += `
                <div data-v-0066c9b3="" data-v-57a33098="" class="feed_card item" style="position: absolute; left: ${left}px; top: ${top}px;">
                    <a data-v-0066c9b3="" href="#" onclick="return false;">
                        <div data-v-0066c9b3="" class="card_box">
                            <div data-v-0066c9b3="" class="social_img_box square" style="width: 209px; height: 209px; padding-top: 0;">
                                <img data-v-0066c9b3="" src="${idx.blogImagesList[0].imageUrl}" title="${idx.blogId}">
                            </div>
                        </div>
                    </a>
                </div>
                `;

        left += left_gap;
    });
    document.querySelector('.content_area .masonry_posts').innerHTML = html;
}

function posting_img(email) {
    const image_table = document.querySelector('.content_area .social_feeds');
    let html = '';

    get_posting_image_from_server(email).then(result => {
        if(result.length > 0) {
            have_posting(result);
        } else {
            empty_posting();
        }
    });
}


document.querySelector('#step1 button').addEventListener('click', (e)=> {
    e.preventDefault();
    document.querySelector('#step1 input').click();
});

async function get_items_list_from_server(the_keywords) {
    try {
        const url = await fetch(`/blog/search/${the_keywords}`);
        const result = await url.json();
        return result;
    } catch (error) {
        console.log(error);
    }
}

let step2_selected = '';
document.querySelector('#step2 .checkout__input input').addEventListener('input', (e)=> {
    const the_keywords = e.target.value;
    const items_table = document.querySelector('#step2 .suggest_area .suggest_list');
    html = '';

    if(the_keywords.length > 0) {
        get_items_list_from_server(the_keywords).then(result => {
            result.forEach((idx)=> {
                html += `<div data-v-2741e9de="" class="suggest_item">
                            <a data-v-2741e9de="" href="${idx.itemId}" onclick="return false;" class="suggest_link">
                                <div data-v-2741e9de="" class="suggest_thumb">
                                    <img data-v-2741e9de="" src="${idx.itemImage}">
                                </div>
                                <div data-v-2741e9de="" class="suggest_info">
                                    <p data-v-2741e9de="" class="model_title">${idx.itemName}</p>
                                </div>
                            </a>
                        </div>`
            });
            items_table.innerHTML = html;

            if(items_table.offsetHeight > 0) {
                items_table.style.height = '360px';
            } else {
                items_table.style.height = 'auto';
            }
        });
    } else {
        items_table.innerHTML = step2_selected;
    }

});

async function getPostCount(email) {
    try {
        const url = await fetch(`/blog/posting-count/${email}`);
        const result = await url.json();
        
        document.querySelector('span#post-count.menu_count').innerText = result.blogCount;
    } catch (error) {
        console.log(error);
    }
}

async function get_blog_detail_from_server(blog_id) {
    try {
        const url = await fetch(`/blog/blog_modal?blogId=${blog_id}`);
        const result = await url.text();
        return result;
    } catch (error) {
        console.log(error);
    }
}

document.addEventListener('click', (e)=> {
    const the_button = e.target;

    if(the_button.closest('.suggest_list') == document.querySelector('#step2 .suggest_list')
    && the_button != document.querySelector('#step2 .suggest_list')) {
        const item_id = the_button.closest('a').href.substring(the_button.closest('a').href.lastIndexOf('/')+1);
        const item_image = the_button.closest('a').querySelector('img').src;
        const item_name = the_button.closest('a').querySelector('p').innerText;

        document.querySelector('#step2 #item-id').value = item_id;
        document.querySelector('#step2 #item-image').value = item_image;
        document.querySelector('#step2 #item-name').value = item_name;

        step2_selected = `  <div data-v-2741e9de="" class="suggest_item">
                                <a data-v-2741e9de="" onclick="return false;" class="suggest_link">
                                    <div data-v-2741e9de="" class="suggest_thumb">
                                        <img data-v-2741e9de="" src="${item_image}">
                                    </div>
                                    <div data-v-2741e9de="" class="suggest_info">
                                        <p data-v-2741e9de="" class="model_title">${item_name}</p>
                                    </div>
                                </a>
                            </div>`

        document.querySelector('#step2 .suggest_list'). innerHTML = step2_selected;
        document.querySelector('#step2 .checkout__input input').value = '';
        document.querySelector('#step3 #copy-item'). innerHTML = step2_selected;

        if(String(item_id).length > 0 && item_image.length > 0 && item_name.length > 0) {
            document.querySelector('.modal-footer #next').disabled = false;
        }
    } else if(the_button.tagName == 'IMG' && the_button.closest('.masonry_posts')) {
        get_blog_detail_from_server(the_button.title).then(result => {
            document.querySelector('#detail-Modal .modal-body').innerHTML = result;
        });

        document.querySelector('#detail-button').click();
    }
});

document.getElementById('fileUpload').addEventListener('change', (evt)=> {
    if(evt.target.files[0].type.includes('image/')) {
        const imgSrc = URL.createObjectURL(document.getElementById('fileUpload').files[0]);
        preview.src = imgSrc;
        preview.style.display = 'block';
        document.getElementById('copy-preview').src = imgSrc;
        document.querySelector('.modal-footer #next').disabled = false;
    } else {
        
    }

});

let progress = document.getElementById('step1');
document.querySelector('.modal-header button.close').addEventListener('click', (e)=> {
    e.preventDefault();
    progress = document.getElementById('step1');

    for(let i = 1; i <= 3; i++) { 
        document.getElementById(`step${i}`).style.display = 'none'; 
    }
    progress.style.display = 'block';

    document.querySelectorAll('.modal-footer')[1].style.display = 'none';
    document.querySelectorAll('.modal-footer')[0].style.display = 'flex';
});

document.querySelectorAll('.modal-footer').forEach((index)=> {
    index.addEventListener('click', (e)=> {
        const the_button = e.target;
        const next = document.querySelector('.modal-footer #next');
        const prev = document.querySelector('.modal-footer #prev');
        const done = document.querySelector('.modal-footer #done');

        if(the_button == next) {
            progress.style.display = 'none';
            progress = document.getElementById(`step${parseInt(progress.id.charAt(progress.id.length -1)) +1}`);
            progress.style.display = 'block';
            prev.disabled = false;
            // next.disabled = true;

            if(progress == document.getElementById('step3')) {
                document.querySelectorAll('.modal-footer')[0].style.display = 'none';
                document.querySelectorAll('.modal-footer')[1].style.display = 'flex';
            }
        } else if(the_button == prev) {
            progress.style.display = 'none';
            progress = document.getElementById(`step${parseInt(progress.id.charAt(progress.id.length -1)) -1}`);
            progress.style.display = 'block';

            if(progress == document.getElementById('step1')) {
                prev.disabled = true;
            }
        } else if(the_button == done) {
            document.querySelector('#step3 #send').click();
        }
    });
});

/*
* Author : Mr.Doe
* 블로그 메뉴탭 선택시 컨텐츠 끝
*/