/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


fetch("http://localhost:8081/sales-app/customers/json")
        .then(res => res.json()
        .then(json => console.log(json)));