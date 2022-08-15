async function getListFromServer(shoe_brand=null, shoe_category=null, shoe_size=null, pageNo=1){
  try {
    let path = '/product/list'
    let url = '';

    if(filter_category.length > 0) url += url.length == 0 ? `shoe_category=${shoe_category}` : `&shoe_category=${shoe_category}`;
    if(filter_brand.length > 0) url += url.length == 0 ? `shoe_brand=${shoe_brand}` : `&shoe_brand=${shoe_brand}`;
    if(filter_size.length > 0) url += url.length == 0 ? `shoe_size=${shoe_size}` : `&shoe_size=${shoe_size}`;

    const final_url = url.length == 0 ? `${path}?pageNo=${pageNo}&qty=12` : `${path}?${url}&pageNo=${pageNo}&qty=12`;
    const resp = await fetch(final_url);
    const map = await resp.json();
    return map;
  } catch (error) {
    console.log(error);
  }
}

function spreadList(shoe_brand, shoe_category, shoe_size, pageNo){
  getListFromServer(shoe_brand, shoe_category, shoe_size, pageNo).then(result => {
    console.log(result);
    let pageHandler = result.pageHandler;

    // 리스트 시작 
    let div = document.getElementById('printZone');
    div.innerHTML = '';
    let line = '<div class="row">';
    result.voList.forEach(pvo => {
      line +=`<div class="col-lg-3 col-md-6" style="padding-top: 20px; padding-top: 20px;"><div OnClick="location.href ='/items/detail?pno=${pvo.pno}'" style="cursor:pointer;">`;
      line += `<div class="product" style="background-color: #ebf0f5;" data-v-75e33658="" data-v-6a8ef390="">`;
      line += `<picture class="picture product_img"  data-v-75e33658=""><img alt="shoe_image" src="${pvo.th_img }" class="image"></picture></div>`;
      line += `<div class="product__item__text">`;
      line += `<p id="title">${pvo.brand_name }</p>`;
      line += `<p id="name" style="line-height: 16px; font-size: 13px;">${pvo.e_name }</p>`;
      line += `<p id="translated_name" style="line-height: 14px; font-size: 12px; letter-spacing: -.06px; color: rgba(34,34,34,.5);">${pvo.k_name }</p>`;
      if(pvo.min_price != null){
        line += `<p style="padding-top: 11px; line-height: 17px; font-size: 14px; font-weight: 700;">${pvo.min_price}원</p>`;
        line += `<p style="line-height: 13px; font-size: 11px; color: rgba(34,34,34,.5);">즉시 구매가</p>`;
      }
      line += `</div></div></div>`;
    });  
    line+=`</div>`;
    // 상품 리스트 끝

    // 페이지네이션 시작
    line += `<hr><ul class="pagination justify-content-center">`;
    if(pageHandler.prev){
      line += `<li class="page-item"><button class="page-link pageBtn" data-pageno="${pageHandler.endPage-1}">Prev</li>`;
    }
    for(let i = pageHandler.startPage; i<=pageHandler.endPage; i++){
    line += `<li class="page-item ${pageHandler.pgvo.pageNo == i ? 'active':'' }">`;
    line += `<button class="btn btn-success pageBtn" data-pageno="${i}">`;
    line += `${i}</li>`;
    }
    if(pageHandler.next){
      line += `<li class="page-item"><button class="page-link pageBtn" data-pageno="${pageHandler.endPage+1}">Next</li>`;
    }
    line += `</ul>`;
    div.innerHTML += line;
  });
}
// 페이지 버튼 클릭 이벤트
document.addEventListener('click', (e) => {
  if(e.target.classList.contains('pageBtn')){
    console.log('brnd : '+filter_brand+ 'ctgr : ' + filter_category+ 'size : ' + filter_size + 'dataset : '+ e.target.dataset.pageno);
    spreadList(filter_brand, filter_category, filter_size, e.target.dataset.pageno);
  }
});
