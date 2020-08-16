<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@taglib   uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>Redstone</title>
</head>
<body>

    <div id="carouselExampleIndicators"  class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
      <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
    
  </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner">
        
            <div class="carousel-item active">
                <img src="/images/img1.jpg" alt="adventurer's bag" />
                <div class="carousel-caption">
                    <h1>Slide 1</h1>
                </div>
            </div>

            <div class="carousel-item">
                <img src="/images/img2.jpg"  alt="bench full of electronics" />
                <div class="carousel-caption">
                    <h1>Slide 2</h1>
                </div>
            </div>

            <div class="carousel-item">
                <img src="/images/img3.jpg"  alt="bag" />
                <div class="carousel-caption">
                    <h1>Slide 3</h1>
                </div>
            </div>
            
            
            <div class="carousel-item">
                <img src="/images/img4.jpg"  alt="iphones" />
                <div class="carousel-caption">
                    <h1>Slide 4</h1>
                </div>
            </div>
</div>
            <!-- Controls -->
         <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
    </div>



<div class= "container">
<div class="row row-cols-1 row-cols-md-2">  
<c:forEach  items="${market}"  var="c">
  <div class="col mb-4">
    <div class="card">
      <img src="..." class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Card title</h5>
        <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
      </div>
    </div>
  </div>
</c:forEach>

</div>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>
</html>