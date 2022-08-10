document.getElementById('search-button').addEventListener('click', (e)=> {
    e.preventDefault();
    
    const searching_table = document.getElementById('display-modal');
    if(searching_table.style.display == 'none') searching_table.style.display = 'block';
});

console.log(window.location.pathname);