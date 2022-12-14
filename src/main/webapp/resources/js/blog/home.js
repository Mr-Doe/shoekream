async function getListFromServer(url) {
    try {
        const path = await fetch(url);
        const result = await path.json();
        feed_cards(result);
    } catch (error) {
        console.log(error);
    }
}

function feed_cards(result) {
    if(document.querySelector('.tab_item.tab_on').innerHTML.includes('Follwers') && session.length == 0) {
        console.log('test');
    }

    const card_box = document.querySelector('.masonry_posts');
    let card_box_default_height = 1500;
    card_box.style.height = card_box_default_height;
    card_box.innerHTML = '';
    let location_width = 307 , left = 0;
    let location_height = 552, top = 0;
    let card_box_height = 1700; // height = +1700

    result.forEach((idx)=> {
        if(card_box.offsetWidth < left) {
            left = 0;
            top += location_height;
        }

        let html = '';
        html += `
                <div data-v-0066c9b3="" data-v-57a33098="" class="feed_card item" style="position: absolute; left: ${left}px; top: ${top}px;">
                    <a data-v-0066c9b3="" href="#">
                        <div data-v-0066c9b3="" class="card_box">
                            <div data-v-0066c9b3="" class="social_img_box vertical" style="">
                                <img data-v-0066c9b3=""
                                    src="${idx.blogImagePath}" class="social_img" title="${idx.blogId}">
                                </div>
                            <div data-v-0066c9b3="" class="card_detail">
                                <div data-v-0066c9b3="" class="user_box">
                                    <img data-v-0066c9b3="" alt="사용자 프로필 이미지"
                                        src="/resources/dist-temp/img/logo.png" class="img_profile">
                                    <p data-v-0066c9b3="" class="user_name">${idx.ownEmail}</p>
                                </div>
                                <div data-v-0066c9b3="" class="btn_box">
                                    <a data-v-0066c9b3="" href="#" aria-label="좋아요" class="btn like">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-chat-heart" viewBox="0 0 16 16">
                                            <path fill-rule="evenodd" d="M2.965 12.695a1 1 0 0 0-.287-.801C1.618 10.83 1 9.468 1 8c0-3.192 3.004-6 7-6s7 2.808 7 6c0 3.193-3.004 6-7 6a8.06 8.06 0 0 1-2.088-.272 1 1 0 0 0-.711.074c-.387.196-1.24.57-2.634.893a10.97 10.97 0 0 0 .398-2Zm-.8 3.108.02-.004c1.83-.363 2.948-.842 3.468-1.105A9.06 9.06 0 0 0 8 15c4.418 0 8-3.134 8-7s-3.582-7-8-7-8 3.134-8 7c0 1.76.743 3.37 1.97 4.6a10.437 10.437 0 0 1-.524 2.318l-.003.011a10.722 10.722 0 0 1-.244.637c-.079.186.074.394.273.362a21.673 21.673 0 0 0 .693-.125ZM8 5.993c1.664-1.711 5.825 1.283 0 5.132-5.825-3.85-1.664-6.843 0-5.132Z"/>
                                        </svg>
                                        <span data-v-0066c9b3="" class="like_count">${idx.likesCount}</span>
                                    </a>
                                    <a data-v-0066c9b3="" href="#" aria-label="댓글" class="btn comment">
                                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-chat-square-dots" viewBox="0 0 16 16">
                                            <path d="M14 1a1 1 0 0 1 1 1v8a1 1 0 0 1-1 1h-2.5a2 2 0 0 0-1.6.8L8 14.333 6.1 11.8a2 2 0 0 0-1.6-.8H2a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1h12zM2 0a2 2 0 0 0-2 2v8a2 2 0 0 0 2 2h2.5a1 1 0 0 1 .8.4l1.9 2.533a1 1 0 0 0 1.6 0l1.9-2.533a1 1 0 0 1 .8-.4H14a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H2z"/>
                                            <path d="M5 6a1 1 0 1 1-2 0 1 1 0 0 1 2 0zm4 0a1 1 0 1 1-2 0 1 1 0 0 1 2 0zm4 0a1 1 0 1 1-2 0 1 1 0 0 1 2 0z"/>
                                        </svg>
                                        <span data-v-0066c9b3="" class="comment_count">${idx.commentsCount}</span>
                                    </a>
                                </div>
                                <div data-v-0066c9b3="">
                                    <ul data-v-0066c9b3="" class="product_list">
                                        <li data-v-0066c9b3="" class="product_item">
                                            <a data-v-0066c9b3="" href="/items/detail?pno=${idx.itemId}" class="product_link">
                                                <div data-v-75e33658="" data-v-0066c9b3="" class="product" style="background-color: rgb(235, 240, 245);">
                                                    <picture data-v-548c90f9="" data-v-75e33658="" class="picture product_img">
                                                        <img data-v-548c90f9="" src="${idx.itemImage}" class="image">
                                                    </picture>
                                                </div>
                                                <div data-v-0066c9b3="" class="product_desc">
                                                    <p data-v-0066c9b3="" class="product_name">${idx.itemName}</p>
                                                    <div data-v-0066c9b3="" class="price_box">
                                                        <span data-v-0066c9b3="" class="amount">${idx.minPrice}</span>
                                                        <span data-v-0066c9b3="" class="unit">원</span>
                                                    </div>
                                                </div>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                `;

        card_box.innerHTML += html;
        left += location_width;
    });
}

window.addEventListener('resize', (e)=> {
    console.log(window.innerWidth);
});

// window.addEventListener('scroll', (e)=> {
//     console.log(this.scrollY);
// });

const tab_menu = document.querySelectorAll('.style_tab_list a')

let page = 1;
function which_memu() {
    tab_menu.forEach((idx)=> {
        if(idx.classList.contains('tab_on') && idx.innerHTML.includes('Popular')) {
            const url = `/blog/pop_blog/${page}`;
            getListFromServer(url);
        } else if(idx.classList.contains('tab_on') && idx.innerHTML.includes('Lastest')) {
            const url = `/blog/curr_blog/${page}`;
            getListFromServer(url);
        } else if(idx.classList.contains('tab_on') && idx.innerHTML.includes('Follwers')) {
            console.log(3, idx.innerHTML);
            feed_cards();
        }
    });
}

tab_menu.forEach((idx)=> {
    idx.addEventListener('click', (e)=> {
        e.preventDefault();

        tab_menu.forEach((menu)=> {
            if(menu.classList.contains('tab_on')) {
                menu.classList.remove('tab_on');
            }
        });

        e.target.classList.add('tab_on');
        which_memu();

    });
});