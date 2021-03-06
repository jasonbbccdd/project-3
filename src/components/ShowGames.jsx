import React from 'react'
import Carousel from 'react-bootstrap/Carousel'

// import { connect } from 'react-redux'

const ShowGames = () => (
  <div className="text-center">
    <Carousel>
      <Carousel.Item interval={1000}>
        <img
          className="d-block w-100"
          // src="https://i.imgur.com/ih4OGLm.jpg"
          // src="https://i.imgur.com/u8xy6Pd.jpg"
          // src="https://i.imgur.com/gybBS2j.jpg"
          src="https://i.imgur.com/Lh6T05m.jpg"
          alt="Among us"
        />
        <Carousel.Caption>
          <h3>Among us</h3>
          <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
        </Carousel.Caption>
      </Carousel.Item>
    </Carousel>
  </div>
)

export default ShowGames
