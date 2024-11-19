const buttons = document.querySelectorAll(".btn");
let flag = true;
let count =0
const winpatterns = [
    [0, 1, 2],
    [0, 3, 6],
    [0, 4, 8],
    [1, 4, 7],
    [2, 5, 8],
    [2, 4, 6],
    [3, 4, 5],
    [6, 7, 8],
  ];

let winner = document.querySelector(".winner");


 

buttons.forEach(function(btn){
 btn.addEventListener("click",()=>{
    if(flag == true){
        btn.innerHTML = "O";
        flag = false;
        btn.style.color= "green"
        // btn.disabled = true;
        
    }
    else{
        btn.innerHTML = "X"
        flag = true;
        btn.style.color= "red"
    }
    btn.disabled = true;
    count++;

    let isWinner = checkWinner();

    if(count === 9 &!isWinner){
        gameDraw();
    }
 });
});

const gameDraw=()=>{

};

const disablebuttons =()=>{
    buttons.forEach(function(btn){
        btn.disabled = true;
    })
}
 

const checkWinner =()=>{
   winpatterns.forEach(pattern =>{
    
    let pos1val = buttons[pattern[0]].innerHTML;
    let pos2val = buttons[pattern[1]].innerHTML;
    let pos3val = buttons[pattern[2]].innerHTML;
    // console.log(pos1val,pos2val,pos3val);

    
    if(pos1val !== "" && pos2val !== "" && pos3val !== ""){
        if(pos1val == pos2val && pos2val == pos3val){
            console.log(pos1val +" is winner");
            winner.innerHTML= `${pos1val} is a winner`
            disablebuttons();
        }
    }
   })
}