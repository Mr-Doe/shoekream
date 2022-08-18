document.getElementById('search-button').addEventListener('click', (e)=> {
    e.preventDefault();
    
    const searching_table = document.getElementById('display-modal');
    if(searching_table.style.display == 'none') searching_table.style.display = 'block';
});

const path = window.location.pathname;
function show_page_path() {
    const mkae_link_path = document.querySelector('.breadcrumb__links');
    let html = '';
    let session = '<c:out value="${ses}"/>';

    if(path.includes('/product/')) {
        html = `<a href="/product/listPage">Home</a>
                <span>Shop</span>`;
    } else if(path.includes('/items/')) {
        html = `<a href="/product/listPage">Home</a>
                <a href="/product/listPage">Shop</a>
                <span>Item</span>`;
    } else if(path.includes('/member/')) {
        html = `<a href="/product/listPage">Home</a>
                <span>Member</span>`;
    } else if(path.includes('/blog/')) {
        html = `<a href="/product/listPage">Home</a>
                <span>Blog</span>`;
    }

    mkae_link_path.innerHTML = html;
}

function session_check() {
    if(session.length == 0 && path.includes('/member/login')) {
        
    } else if(session.length == 0 && path.includes('/member/register')) {
        
    } else if (session.length == 0 && path.includes('/member/')){
        window.location.href = '/member/login';
    }
}

function header_menu_check() {
    if(path.includes('/product/')) {
        document.getElementById('header_shop').className = 'active';
    } else if(path.includes('/blog/')) {
        document.getElementById('header_blog').className = 'active';
    }
}