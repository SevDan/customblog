import  React from "react";
import "./AuthorProfile.css";

class AuthorProfile {
render(){
    return (
    <div className = "mainDiv">
            <div className = "Name">
                <a style={{color: "#202020"}}><b>VisibleName(ник)</b></a>
                <a style={{color: "#202020"}}><b>AuthorName(ФИО)</b></a>
            </div>
            <div className = "About">
            <p>AuthorAbout</p>
            </div>
            <div className="cardRightSide">
                <img className="Avatar" src="https://wallpapers-fenix.eu/lar/141213/224735864.jpg"/>
                <div className="Status"><div>isActive</div><div>isBanned</div></div>
            </div>
    </div>
    )
    }
}
