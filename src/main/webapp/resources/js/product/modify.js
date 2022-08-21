// 페이지로딩시 브랜드 카테고리 셀렉트박스 생성
function setBrandCategoryId(){
    let brandId = document.getElementById('hiddenBrandId').value;
    let categoryId = document.getElementById('hiddenCategoryId').value;
    let brandSelect = document.querySelectorAll('.brandSelect');
    let categorySelect = document.querySelectorAll('.categorySelect');
    for (let i = 0; i < brandSelect.length; i++) {
        if(brandSelect[i].getAttribute('value') == brandId){
            brandSelect[i].setAttribute("selected", "selected");
        }
    }
    for (let i = 0; i < categorySelect.length; i++) {
        if(categorySelect[i].getAttribute('value') == categoryId){
            categorySelect[i].setAttribute("selected", "selected");
        }
    }
}
// 이미지 파일 체크
const regExpPrevent = new RegExp("\.(exe|sh|bat|js|msi|dll)$"); // 실행파일 막기
const regExpImage = new RegExp("\.(png)$"); // 이미지 파일만 허용
const maxSize = 3 * 1024 * 1024; // 3MB
function fileSizeAndTypeValidation(fileName, fileSize){
    if(regExpPrevent.test(fileName)){
      return 0;  
    } else if(!regExpImage.test(fileName)){
        return 0;
    } else if(fileSize > maxSize){
        return 0;
    } else {
        return 1;
    }
}

document.addEventListener('change', (e) => {    
    if(e.target.id == 'files') {
        document.getElementById('modBtn').disabled = false;
        // input type file element에 저장된 file 정보를 가져오는 property, 리턴은 객체형
        const fileObjects = document.getElementById('files').files;
        console.log(fileObjects);

        let div = document.getElementById('fileZone');
        div.innerHTML = '';
        div.innerHTML = '<h6>새로등록한 사진</h6>';
        let ul = '<ul class="list-group list-group-flush">';

        let isOk = 1;
        for (const file of fileObjects) {
            let vaildFile = fileSizeAndTypeValidation(file.name, file.size);
            isOk *= vaildFile;
            ul += `<li class="${vaildFile ? "bg-success text-white":"bg-danger text-white"} list-group-item d-flex justify-content-between align-items-start">`;
            ul += `<div class="ms-2 me-auto">${file.name}</div>`;
            ul += `<span class="badge bg-primary rounded-pill">${file.size}</span></li>`;
        }
        ul += '</ul>';
        div.innerHTML += ul;
        if(!isOk){
            document.getElementById('modBtn').disabled = true;
            alert('이미지 파일을 확인하세요');
        }
        // 지워질 imageId 가져오기
        else{
            const originalImageIdList = document.querySelectorAll('.originalImageList');
            let imageIdListToArray = '';
            if(originalImageIdList.length > 2){
                for (let i = 0; i < originalImageIdList.length; i++) {
                    let imageId = originalImageIdList[i].dataset.imageid;
                    if(imageIdListToArray.length == 0){
                        imageIdListToArray += imageId;
                    } else {
                        imageIdListToArray += (',' + imageId);
                    }
                }
            } else {
                imageIdListToArray += originalImageIdList[0].dataset.imageid;
            }
            document.getElementById('deleteImagesId').value = imageIdListToArray;
        }
        
    }
});
// 셀렉트박스 브랜드, 카테고리 값 적용하기
var selectBrandId = document.getElementById('selectBrand');
var selectCategoryId = document.getElementById('selectCategory');
document.addEventListener('change', (e) => {
    if(e.target.id == 'selectBrand'){
        document.getElementsByName('brand')[0].value = selectBrandId.options[selectBrandId.selectedIndex].value; 
        console.log("브랜드 id: "+document.getElementsByName('brand').value);
    }
    if(e.target.id == 'selectCategory'){
        document.getElementsByName('category')[0].value = selectCategoryId.options[selectCategoryId.selectedIndex].value; 
        console.log("카테고리 id: "+document.getElementsByName('category').value);
    }
});

document.addEventListener('click', (e) => {
    if(e.target.id == 'delBtn'){
        const pnoVal = document.getElementsByName('pno')[0].value;
        removeProduct(pnoVal).then(result => {
            if(result){
                alert('상품이 정상적으로 삭제되었습니다.');
                window.location.href = '/product/adminList';
            } else {
                alert('상품 거래내역이 있어서 삭제가 불가합니다.');
                window.location.href = '/product/adminList';
            }
        });
    }
});

async function removeProduct(pno) {
    try {
        const url = "/product/"+pno;
        const config = {
            method : 'DELETE'
        };
        const resp = await fetch(url, config);
        const result = await resp.text();
        return result;
    } catch (error) {
        console.log(error);
    }
}