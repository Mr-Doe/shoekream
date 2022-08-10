document.getElementById('search-button').addEventListener('click', (e)=> {
    e.preventDefault();
    
    const searching_table = document.getElementById('display-modal');
    if(searching_table.style.display == 'none') searching_table.style.display = 'block';
});

function show_page_path() {
    const path = window.location.pathname;
    const mkae_link_path = document.querySelector('.breadcrumb__links');
    let html = '';

    if(path.includes('/product/')) {
        html = `<a href="/product/list">Home</a>
                <span>Shop</span>`
    } else if(path.includes('/items/')) {
        html = `<a href="/product/list">Home</a>
                <a href="/product/list">Shop</a>
                <span>Item</span>`
    }
    mkae_link_path.innerHTML = html;
}