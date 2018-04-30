<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="reset.css">
    <link rel="stylesheet" href="youtube-video.css">
    <link href="https://fonts.googleapis.com/css?family=Roboto:400,700" rel="stylesheet">
    <title>Java EE 8: What’s New in the Java EE 8 Release</title>
</head>
<body>
    <header>
        <a href="youtube-accueil.html">
            <img id="logo" src="img/logo.png" alt="YouTube/home"></a>   
        <input type="search">
        <img id="search" src="img/search.png" alt="Search">
    </header> 

    <div id="content">
        <div id="content__left">
            <div id="main-video">
                <video src="https://youtu.be/FCsqchsK9UA" controls poster="sintel.jpg"></video>
                <h1 class="main-video-title">${ mainVideo.title }</h1>
            </div>

            <div id="about-the-video">
                <p id="views">2073 views</p> 
                <a href=""><img id="like" src="img/like.png" alt="like"></a>
                <p class="number">32</p>
                <a href=""><img id="dislike" src="img/dislike.png" alt="dislike"></a>
                <p class="number">15</p>
                <a href=""><p id="share">SHARE</p></a>
            </div>
            <hr>
            
            <div class="about-the-author">
                <div class="author">
                    <a href=""><img class="author-logo" src="img/Java.png" alt="Java"></a>
                    <h1>Java</h1>
                    <a href=""><img id="subscribe" src="img/subscribe.png" alt="SUBSCRIBE"></a>
                </div>
                <h2>Uploaded 10 days ago</h2>
                <p>${ mainVideo.description }</p>
            </div>
            <hr>
            
            <h1 class="number-of-comments">1 comment : </h1>
            <div class="comments">
                <a href=""><img class="comment-logo" src="img/Mark.png" alt="Mark"></a>
                <p>Great ! <br>Interesting video.</p>
            </div>
            <hr>

            <div class="add-a-comment">   
                <a href=""><img class ="user-logo" src="img/User.png" alt="user"></a>
                <input type="text" name="post-comment" placeholder="Post a comment here"/>
            </div>
        </div>

        <div id="content__right"> 
            <h2 id="next-video">Next videos :</h2>
            
             <div class="video">
                <div class="video-img"><a href="https://www.youtube.com/watch?v=FCsqchsK9UA">  
                    <img src="img/oracle.png" alt="What’s New in the Java EE 8 Release"></a>
                </div>
                
                <div class="video-description"><a href="https://www.youtube.com/watch?v=FCsqchsK9UA">
                    <p class="video-title">Java EE 8: What’s New in the Java EE 8 Release</p></a> 
                    <p class="video-details"> Java 
                    <br> Added the 2 oct 2017 - 2,5k views </p>
                </div>
            </div> 

            <div class="video">
                <div class="video-img"><a href="https://www.youtube.com/watch?v=FCsqchsK9UA">  
                    <img src="img/oracle.png" alt="What’s New in the Java EE 8 Release"></a>
                </div>
                
                <div class="video-description"><a href="https://www.youtube.com/watch?v=FCsqchsK9UA">
                    <p class="video-title">Java EE 8: What’s New in the Java EE 8 Release</p></a> 
                    <p class="video-details"> Java 
                    <br> Added the 2 oct 2017 - 2,5k views </p>
                </div>
            </div> 

            <div class="video">
                <div class="video-img"><a href="https://www.youtube.com/watch?v=FCsqchsK9UA">  
                    <img src="img/oracle.png" alt="What’s New in the Java EE 8 Release"></a>
                </div>
                
                <div class="video-description"><a href="https://www.youtube.com/watch?v=FCsqchsK9UA">
                    <p class="video-title">Java EE 8: What’s New in the Java EE 8 Release</p></a> 
                    <p class="video-details"> Java 
                    <br> Added the 2 oct 2017 - 2,5k views </p>
                </div>
            </div> 
            
            <div class="video">
                <div class="video-img"><a href="https://www.youtube.com/watch?v=FCsqchsK9UA">  
                    <img src="img/oracle.png" alt="What’s New in the Java EE 8 Release"></a>
                </div>
                
                <div class="video-description"><a href="https://www.youtube.com/watch?v=FCsqchsK9UA">
                    <p class="video-title">Java EE 8: What’s New in the Java EE 8 Release</p></a> 
                    <p class="video-details"> Java 
                    <br> Added the 2 oct 2017 - 2,5k views </p>
                </div>
            </div> 
            
            <div class="video">
                <div class="video-img"><a href="https://www.youtube.com/watch?v=FCsqchsK9UA">  
                    <img src="img/oracle.png" alt="What’s New in the Java EE 8 Release"></a>
                </div>
                
                <div class="video-description"><a href="https://www.youtube.com/watch?v=FCsqchsK9UA">
                    <p class="video-title">Java EE 8: What’s New in the Java EE 8 Release</p></a> 
                    <p class="video-details"> Java 
                    <br> Added the 2 oct 2017 - 2,5k views </p>
                </div>
            </div> 
            
            <div class="video">
                <div class="video-img"><a href="https://www.youtube.com/watch?v=FCsqchsK9UA">  
                    <img src="img/oracle.png" alt="What’s New in the Java EE 8 Release"></a>
                </div>
                
                <div class="video-description"><a href="https://www.youtube.com/watch?v=FCsqchsK9UA">
                    <p class="video-title">Java EE 8: What’s New in the Java EE 8 Release</p></a> 
                    <p class="video-details"> Java 
                    <br> Added the 2 oct 2017 - 2,5k views </p>
                </div>
            </div> 
            
            <div class="video">
                <div class="video-img"><a href="https://www.youtube.com/watch?v=FCsqchsK9UA">  
                    <img src="img/oracle.png" alt="What’s New in the Java EE 8 Release"></a>
                </div>
                
                <div class="video-description"><a href="https://www.youtube.com/watch?v=FCsqchsK9UA">
                    <p class="video-title">Java EE 8: What’s New in the Java EE 8 Release</p></a> 
                    <p class="video-details"> Java 
                    <br> Added the 2 oct 2017 - 2,5k views </p>
                </div>
            </div> 
            
            <div class="video">
                <div class="video-img"><a href="https://www.youtube.com/watch?v=FCsqchsK9UA">  
                    <img src="img/oracle.png" alt="What’s New in the Java EE 8 Release"></a>
                </div>
                
                <div class="video-description"><a href="https://www.youtube.com/watch?v=FCsqchsK9UA">
                    <p class="video-title">Java EE 8: What’s New in the Java EE 8 Release</p></a> 
                    <p class="video-details"> Java 
                    <br> Added the 2 oct 2017 - 2,5k views </p>
                </div>
            </div>  
           
        </div> 
    </div>
              
</body>
</html>