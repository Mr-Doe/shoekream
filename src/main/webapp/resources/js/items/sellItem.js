document.addEventListener('click', (e) =>{   
    // console.log(e.target.closest('li').id);
    // console.log(e.target.classList);
    if(e.target.classList.contains('item_link')){
        if(e.target.closest('li').id == 'panel1'){
            document.getElementById('bid').style.display = 'block';
            document.getElementById('immediately').style.display = 'none';
            document.querySelector('.input_amount').value = "";
            document.getElementById('order_btn').classList.add('disabled');
        };

        if(e.target.closest('li').id == 'panel2'){
            document.getElementById('immediately').style.display = 'block';
            document.getElementById('bid').style.display = 'none';
        };
    };
});

document.getElementById('bid_price').addEventListener('onchange', (e) => {
        let price = document.getElementById('amount').innerText;
        price = price.substring(',', '');
        console.log(typeof(price));
        console.log(price);
        if(e.target.value < price){
            document.getElementById('panel2')[0].click();
        }
});