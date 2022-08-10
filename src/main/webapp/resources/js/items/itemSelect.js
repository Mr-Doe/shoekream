document.addEventListener('click', (e) => {
    console.log(e.target.querySelector);

    if(e.target.classList.contains('select_link') || e.target.classList.contains('size') || e.target.classList.contains('price')){
        document.querySelector('.active').classList.remove('active');
        if(e.target.closest('li').classList.contains('select_item')){
            e.target.closest('li').classList.add('active');
        }
    }

});