async function getListFromServer(shoe_brand=null, shoe_category=null, shoe_size=null, pageNo=1){
  try {
    let path = '/product/list'
    let url = '';

    if(filter_category.length > 0) url += url.length == 0 ? `shoe_category=${shoe_category}` : `&shoe_category=${shoe_category}`;
    if(filter_brand.length > 0) url += url.length == 0 ? `shoe_brand=${shoe_brand}` : `&shoe_brand=${shoe_brand}`;
    if(filter_size.length > 0) url += url.length == 0 ? `shoe_size=${shoe_size}` : `&shoe_size=${shoe_size}`;

    const final_url = url.length == 0 ? `${path}?pageNo=${pageNo}&qty=12` : `${path}?${url}&pageNo=${pageNo}&qty=12`;
    const resp = await fetch(final_url);
    const productDTO = await resp.json();
    return productDTO;
  } catch (error) {
    console.log(error);
  }
}

function spreadList(shoe_brand, shoe_category, shoe_size, pageNo){
  getListFromServer(shoe_brand, shoe_category, shoe_size, pageNo).then(result => {
    console.log(result);
    let pageHandler = result.pagehdlr;

    // 상품 리스트 시작 
    let div = document.getElementById('printZone');
    div.innerHTML = '';
    let line = '<div class="row">';
    result.productList.forEach(pvo => {
      line +=`<div class="col-lg-3 col-md-6" style="padding-top: 20px; padding-top: 20px;"><div OnClick="location.href ='/items/detail?pno=${pvo.pno}'" style="cursor:pointer;">`;
      line += `<div class="product" style="background-color: #ebf0f5;" data-v-75e33658="" data-v-6a8ef390="">`;
      line += `<picture class="picture product_img"  data-v-75e33658=""><img alt="shoe_image" src="${pvo.imageUrl }" class="image"></picture></div>`;
      line += `<div class="product__item__text">`;
      line += `<p id="title">${pvo.brandName }</p>`;
      line += `<p id="name" style="line-height: 16px; font-size: 13px;">${pvo.eName }</p>`;
      line += `<p id="translated_name" style="line-height: 14px; font-size: 12px; letter-spacing: -.06px; color: rgba(34,34,34,.5);">${pvo.kName }</p>`;
      if(pvo.minPrice == 0){
        line += `<p style="padding-top: 11px; line-height: 17px; font-size: 14px; font-weight: 700;"> - </p>`
      }  else {
        line += `<p style="padding-top: 11px; line-height: 17px; font-size: 14px; font-weight: 700;">${pvo.minPrice}원</p>`;
      }
      line += `<p style="line-height: 13px; font-size: 11px; color: rgba(34,34,34,.5);">즉시 구매가</p>`;
      line += `</div></div></div>`;
    });
    line+=`</div>`;
    // 상품 리스트 끝

    // 페이지네이션 시작
    line += `<hr>`
    line += `<div class="pagination">`
    if(pageHandler.prev){
      line += `<a class="pageBtn" href="#" onclick="return false" data-pageno="${pageHandler.startPage-1}">&laquo;</a>`;
    }
    for(let i = pageHandler.startPage; i <= pageHandler.endPage; i++){
      line += `<a class="pageBtn" href="#" style="${pageHandler.pgvo.pageNo == i ? 'background-color: rgb(235, 240, 245); border-radius: 5px;' : ''} " onclick="return false" data-pageno="${i}">${i}</a>`;
    }
    if(pageHandler.next){
      line += `<a class="pageBtn" href="#" onclick="return false" data-pageno="${pageHandler.endPage+1}">&raquo;</a>`;
    }
    line += `</div>`;
    div.innerHTML += line;
    // 페이지네이션 끝    
  });
}



document.addEventListener('click', (e) => {
  // 페이지 버튼 클릭 이벤트
  if(e.target.classList.contains('pageBtn')){
    spreadList(filter_brand, filter_category, filter_size, e.target.dataset.pageno);
  }
});
