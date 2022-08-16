let sesEmail = document.getElementById('sesEmail').value;
let buyerEmail = document.getElementById('buyerEmail').value;
let sellerEmail = document.getElementById('sellerEmail').value;
let itemNo = document.getElementById('itemNo').value;

if (sesEmail === buyerEmail) {
    document.getElementById('orderNumber').innerText = "";
    document.getElementById('orderNumber').innerText = "B-SN" + itemNo;
    document.getElementById('listBtn').href = "";
    document.getElementById('listBtn').href = "/member/buying?email=" + sesEmail;
} else if (sesEmail === sellerEmail) {
    document.getElementById('orderNumber').innerText = "";
    document.getElementById('orderNumber').innerText = "A-SN" + itemNo;
    document.getElementById('listBtn').href = "";
    document.getElementById('listBtn').href = "/member/selling?email=" + sesEmail;
}

document.getElementById('delBtn').addEventListener('click', (e) =>{
    e.preventDefault();

    const delForm = document.getElementById('itemsRmForm');
    delForm.setAttribute('action', '/items/removeItem');
    delForm.submit();
});