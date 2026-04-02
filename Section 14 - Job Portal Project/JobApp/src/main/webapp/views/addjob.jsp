<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Telusko Job Portal</title>

    <!-- Bootstrap -->
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            crossorigin="anonymous">

    <!-- ✅ ONLY ONE CSS FILE -->
    <link rel="stylesheet" href="/css/style.css">

    <!-- ✅ FONT (for consistent look) -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap"
          rel="stylesheet">

</head>
<body>

<!-- Navbar (UNCHANGED) -->
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

<!-- Form Section (UNCHANGED) -->
<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card">
                <div class="card-body">

                    <h2 class="mb-3 text-center fs-3 font-weight-bold">
                        Post a new Job
                    </h2>

                    <form action="handleForm" method="post">

                        <div class="mb-1">
                            <label for="postId" class="form-label">Post ID</label>
                            <input type="text" class="form-control" id="postId"
                                   name="postId" required>
                        </div>

                        <div class="mb-1">
                            <label for="postProfile" class="form-label">Post Profile</label>
                            <input type="text" class="form-control"
                                   id="postProfile" name="postProfile" required>
                        </div>

                        <div class="mb-1">
                            <label for="postDesc" class="form-label">Post Description</label>
                            <textarea class="form-control" id="postDesc"
                                      name="postDesc" rows="2" required></textarea>
                        </div>

                        <div class="mb-1">
                            <label for="reqExperience" class="form-label">Required Experience</label>
                            <input type="number" class="form-control"
                                   id="reqExperience" name="reqExperience" required>
                        </div>

                        <div class="mb-2">
                            <label for="postTechStack" class="form-label">Tech Stack</label>

                            <!-- ✅ MULTI SELECT KEPT SAME -->
                            <select multiple class="form-select"
                                    id="postTechStack" name="postTechStack" required>

                                <option value="Java">Java</option>
                                <option value="JavaScript">JavaScript</option>
                                <option value="Swift">Swift</option>
                                <option value="TypeScript">TypeScript</option>
                                <option value="Go">Go</option>
                                <option value="Kotlin">Kotlin</option>
                                <option value="Rust">Rust</option>
                                <option value="PHP">PHP</option>
                                <option value="HTML5">HTML5</option>
                                <option value="CSS3">CSS3</option>
                                <option value="GraphQL">GraphQL</option>
                                <option value="Angular">Angular</option>
                                <option value="React Native">React Native</option>
                                <option value="Flutter">Flutter</option>
                                <option value="Node.js">Node.js</option>
                                <option value="Express.js">Express.js</option>
                                <option value="Django">Django</option>
                                <option value="Flask">Flask</option>
                                <option value="Docker">Docker</option>
                                <option value="Kubernetes">Kubernetes</option>
                                <option value="AWS">AWS</option>
                                <option value="Azure">Azure</option>
                                <option value="DevOps">DevOps</option>
                                <option value="Machine Learning">Machine Learning</option>
                                <option value="Artificial Intelligence">Artificial Intelligence</option>

                            </select>
                        </div>

                        <button type="submit" class="btn btn-primary">
                            Submit
                        </button>

                    </form>

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