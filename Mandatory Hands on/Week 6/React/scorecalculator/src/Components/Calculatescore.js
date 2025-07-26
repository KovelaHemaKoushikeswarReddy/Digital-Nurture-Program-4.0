import React,{Component} from "react";
import './Calculatecsore.css';
const calc =(total,goal)=>{
    return total/goal
}
export const Calculatescore=({Name,Age,Total,goal})=>
{
    return(
    <div class="score-box">
        <h1>
            the name is {Name}
        </h1><br>
        </br>
        <h1>
            the Age is {Age}
        </h1><br>
        </br>
        <h1>
            the Total is {Total}
        </h1><br>
        </br>
        <h1>
            the goal is {goal}
        </h1><br>
        </br>
        <h1>
            the answer is {calc(Total,goal)}
        </h1><br>
        </br>
    </div>);
}