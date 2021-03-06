html {
  body {

    #root {

      // public show game page
      #pages-public-gamelist {
        min-height: 100vh;
        position: relative;
        display: flex;
        flex-direction: column;

        #game-cover {
          margin-bottom: 20px;
        }

        .pages-dev-gamelist-header {
          display: flex;
          flex-direction: row;
          justify-content: space-evenly;
          font-family: 'Biryani',
            sans-serif;

        }

        #pages-dev-games-container {
          display: flex;
          justify-content: center;
          flex-grow: 1;

          .talent-apply-button {
            width: 100px;
            height: 100px;
          }

          .pages-dev-games-list {
            display: flex;
            justify-content: center;

            .pages-dev-games-item {
              border-style: none;
              font-family: 'Biryani',
                sans-serif;

              a:link,
              a:visited {
                color: black;
                text-decoration: none;
              }

              a:hover {
                color: rgb(233, 131, 36)
              }
            }
          }
        }
      }

      // dev-showpage
      #dev-showpage {

        #showpage-carousel-and-description-wrapper {
          margin-left: 100px;
          margin-top: 100px;
          position: relative;

          #game-name {
            font-family: 'Expletus Sans',
              cursive;
          }

          #btn-apply {
            font-family: 'Expletus Sans',
              cursive;
            font-size: 2rem;
          }

          #btn-applied {
            font-family: 'Expletus Sans',
              cursive;
            font-size: 1.5rem;
          }

          #showpage-carousel-container {
            width: 650px;
            height: 500px;


            @media screen and(max-width: 1430px) {
              width: 400px;
              height: 300px;
              margin-left: 20px;
              margin-top: 60px;
            }
          }

          #showpage-description-container {

            margin-left: 70px;
            margin-top: 200px;
            margin-right: 60px;

            position: relative;
            font-family: 'Biryani',
              sans-serif;

            // @media screen and(max-width: 1358px) {
            //   width: 350px;
            //   min-height: 400px;
            //   margin-right: 60px;
            // }
          }
        }




        #applicant-list {
          margin-top: 200px;

          @media screen and (max-width: 1358px) {
            margin-top: 250px;
          }

          font-family: 'Biryani',
          sans-serif;

          .showpage-applicant-list-row {
            margin-top: 10px;

            .showpage-applicant-list-item {
              border-right-style: none;
            }

          }
        }


        #showpage-job-detail-container {
          @media screen and (min-width: 1358px) {
            margin: 130px;
          }

          @media screen and (min-width: 1430px) {
            margin-top: 200px;
          }

          #job-detail {
            font-family: 'Biryani',
              sans-serif;

            .showpage-job-detail-row {
              margin-top: 100px;

              .job-description {
                margin-top: 50px;

                .showpage-job-description-listgroup {
                  margin-top: 10px;

                  .showpage-job-description-item {
                    border-right-style: none;
                  }

                }
              }

              .job-requirement {
                margin-top: 50px;

                .showpage-job-requirement-listgroup {
                  margin-top: 10px;

                  .showpage-job-requirement-item {
                    border-right-style: none;
                  }
                }

              }
            }

          }
        }


      }


    }



  }
}
