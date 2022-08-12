document.querySelectorAll('.select_link, .size, .price').forEach((price) =>{
    price.addEventListener('click', (e) => {
        e.preventDefault();

        document.querySelector('.active').classList.remove('active');
        if (e.target.closest('li').classList.contains('select_item')) {
            e.target.closest('li').classList.add('active');

            document.getElementById('order_price').innerText = e.target.closest('li').querySelector('.price').innerText;
            document.getElementById('order_btn_area').style.display = 'block';
        }
    });
});