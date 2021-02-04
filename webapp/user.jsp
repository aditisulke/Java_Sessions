<%@include file = "header.jsp" %>

<body>
    <header>
      <h1><span class="badge bg-secondary">Admin Dashboard</span></h1>
    </header>

    <nav class="nav_bar">
      <ul class="nav flex-column">
        <a href="admin_profile.html" class="nav-item btn btn-info" id="profile">
          Profile</a>
        
          <a href="quiz-documentation.txt"     class="nav-item btn btn-info"    id="documentation">  Documentation</a>

        <button class="nav-item btn btn-info">Most Attempted Test</button>
        <button class="nav-item btn btn-info">FAQ</button>
        <button class="nav-item btn btn-info">Log Out</button>
      </ul>
    </nav>

    <section>
      <div class="container" id="card-one">
        <div class="row gx-5 gy-5">
          <div class="col-lg-6 col-sm-12">
            <div class="card">
              <img src="Frame 1c.png" class="card-img-top" alt="===" />
              <div class="card-body">
                <h5 class="card-title">C Language</h5>
                <p class="card-text">Perform Crud Operations.</p>
                <a href="C_admin_test_table.html" class="btn btn-warning"
                  >View</a
                >
              </div>
            </div>
          </div>

          <div class="col-lg-6 col-sm-12" id="card-two">
            <div class="card">
              <img src="Frame 1c++.png" class="card-img-top" alt="===" />
              <div class="card-body">
                <h5 class="card-title">C++ Language</h5>
                <p class="card-text">Perform Crud Operations.</p>
                <a href="one.html" class="btn btn-warning">View</a>
              </div>
            </div>
          </div>
        </div>

        <div class="row gx-5 gy-5" id="card-three">
          <div class="col-lg-6 col-sm-12">
            <div class="card">
              <img src="Frame 1java.png" class="card-img-top" alt="===" />
              <div class="card-body">
                <h5 class="card-title">Java Language</h5>
                <p class="card-text">Perform Crud Operations.</p>
                <a href="one.html" class="btn btn-warning">View</a>
              </div>
            </div>
          </div>

          <div class="col-lg-6 col-sm-12" id="card-four">
            <div class="card">
              <img src="Frame 1html5.png" class="card-img-top" alt="===" />
              <div class="card-body">
                <h5 class="card-title">HTML Language</h5>
                <p class="card-text">Perform Crud Operations.</p>
                <a href="one.html" class="btn btn-warning">View</a>
              </div>
            </div>
          </div>
        </div>
        <div class="category-button" id="category-button">
            <a href="one.html" class="btn btn-warning">Add new Test Category</a>
          </div>
      </div>
      
    </section>
  </body>

<%@include file = "footer.jsp" %>