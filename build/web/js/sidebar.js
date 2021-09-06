/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

let boton = document.querySelector("#boton");
let sidebar = document.querySelector(".sidebar");

boton.onclick = function () {
    sidebar.classList.toggle("active");
}
