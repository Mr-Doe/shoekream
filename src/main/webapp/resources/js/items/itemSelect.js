document.querySelectorAll('.select_link, .size, .price').forEach((price) =>{
    price.addEventListener('click', (e) => {
        e.preventDefault();

        document.querySelector('.active').classList.remove('active');
        if (e.target.closest('li').classList.contains('select_item')) {
            e.target.closest('li').classList.add('active');

            let price = e.target.closest('li').querySelector('.price').innerText;
            console.log(price);
            document.getElementById('order_price').innerText = price;
            document.getElementById('order_btn_area').style.display = 'block';
        }
    });
});