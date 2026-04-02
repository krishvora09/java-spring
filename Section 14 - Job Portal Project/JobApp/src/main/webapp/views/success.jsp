<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="dev.krishvora09.JobApp.model.JobPost" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Job Post Details</title>

    <!-- Bootstrap -->
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            crossorigin="anonymous">

    <!-- ✅ ONLY ONE CSS FILE -->
    <link rel="stylesheet" href="/css/style.css">

    <!-- Font -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap"
          rel="stylesheet">

</head>
<body>

<!-- Navbar (UNCHANGED STRUCTURE) -->
<nav class="navbar navbar-expand-lg navbar-light bg-warning">
    <div class="container">
        <a class="navbar-brand fs-1 fw-medium" href="#">Job Portal</a>

        <button class="navbar-toggler" type="button"
                data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="home">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="viewalljobs">All Jobs</a></li>
            </ul>
        </div>
    </div>
</nav>

<%
    JobPost myJobPost = (JobPost) request.getAttribute("jobPost");
%>

<div class="container mt-5">
    <h2 class="mb-4 text-center font-weight-bold">Job Post Details</h2>

    <div class="row justify-content-center">
        <div class="col-md-6">

            <!-- ✅ REMOVED bg-dark text-white -->
            <div class="card">
                <div class="card-body">

                    <h5 class="card-title">
                        <%= myJobPost.getPostProfile() %>
                    </h5>

                    <p class="card-text">
                        <strong>Description:</strong>
                        <%= myJobPost.getPostDesc() %>
                    </p>

                    <p class="card-text">
                        <strong>Experience Required:</strong>
                        <%= myJobPost.getReqExperience() %> years
                    </p>

                    <p class="card-text">
                        <strong>Tech Stack:</strong>
                    </p>

                    <ul>
                        <% for (String tech : myJobPost.getPostTechStack()) { %>
                            <li><%= tech %></li>
                        <% } %>
                    </ul>

                </div>

                <div class="card-footer">
                    <!-- Optional footer -->
                </div>
            </div>

        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>

</body>
</html>