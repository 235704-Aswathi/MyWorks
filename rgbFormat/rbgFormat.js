const rgbBtn=document.getElementById("rgb");
const hexBtn=document.getElementById("hex");

const rgbClickHandler= function(event){
    console.log("rgb");
   
    document.body.style.background=rgbRandom();
    rgbBtn.style.backgroundColor=rgbRandom();
    rgbBtn.style.color=rgbRandom();
}
const rgbRandom=function(event){
    const r=Math.floor(Math.random()*256);
    const g=Math.floor(Math.random()*256);
    const b=Math.floor(Math.random()*256);
    const color=`rgb(${r},${g},${b})`;
    return color;
}

const hexClickHandler=function(event){
   
    document.body.style.backgroundColor=hexRandom();
    hexBtn.style.backgroundColor=hexRandom();
    hexBtn.style.color=hexRandom();

}
const hexRandom =function(event){
    const hexValues="0123456789ABCDEF";
    let hexColor="#";
    for(let i=0;i<6; i++){
        hexColor+=hexValues[Math.floor(Math.random()*16)];
    }return hexColor;
}
const reload=function(event){
    rgbClickHandler();
    hexClickHandler();
}
document.addEventListener('DOMContentLoaded',reload);

rgbBtn.addEventListener('click',rgbClickHandler);
hexBtn.addEventListener('click',hexClickHandler);



