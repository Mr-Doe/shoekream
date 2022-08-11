const pno = document.getElementById('pno').innerText;

document.querySelector('.sizeBtn').addEventListener('click', () => {
    document.querySelector('.layer_detail_size_select').style.display = "block";
});

document.querySelector('.close').addEventListener('click', () => {
    document.querySelector('.layer_detail_size_select').style.display = "none";
});

document.addEventListener('click', (e) => {
    if(e.target.classList.contains('select_link') || e.target.classList.contains('size') || e.target.classList.contains('price')){
        e.target.closest('ul').querySelector('.active').classList.remove('active');
        e.target.closest('li').classList.add('active');
        document.querySelector('.sizeValue').innerText = e.target.closest('button').querySelector('.size').innerText;
        let buyPrice = e.target.closest('button').querySelector('.price').innerText;
        document.querySelector('.buy').querySelector('.num').innerText = buyPrice=='구매입찰' ? '-\u00a0': buyPrice;
        recentPriceSellPice(pno, e.target.closest('li').dataset.size).then(result => {
            document.getElementById('recentPriceValue').innerText = result.recentPrice!=null ? result.recentPrice : '-\u00a0';
            document.querySelector('.sell').querySelector('.num').innerText = result.maxSellPrice!=null ? result.maxSellPrice : '-\u00a0';
        });
        document.querySelector('.layer_detail_size_select').style.display = "none";
    }
});

async function recentPriceSellPice(pno, size) {
    try {
      const resp = await fetch('/items/' + pno + '/' + size);
      const rp = await resp.json();
      return await rp;
    } catch (error) {
      console.log(error);
    }
}