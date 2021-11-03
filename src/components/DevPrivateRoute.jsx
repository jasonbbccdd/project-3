import React from 'react'
import PropTypes from 'prop-types'
import { Route, Redirect } from 'react-router-dom'
import { connect } from 'react-redux'
import { toast } from 'react-toastify'

const DevPrivateRoute = ({ component: Component, currentUserState: { currentUser }, ...rest }) => {
  let curUserType
  if (currentUser && (currentUser.type === 'Developer')) {
    curUserType = currentUser.type
  } else if (currentUser && (currentUser.type === 'Marketer')) {
    curUserType = currentUser.type
  } else {
    curUserType = false
  }
  if (curUserType !== 'Developer') {
    toast.error('Please Login First!', {
      position: 'bottom-left',
      autoClose: 5000,
      hideProgressBar: false,
      closeOnClick: true,
      pauseOnHover: true,
      draggable: true,
      progress: undefined
    })
  }

  return (
    <Route
      {...rest}
      render={(props) => (
        curUserType === 'Developer' ? <Component {...props} /> : <Redirect to="/" />
      )}
    />
  )
}

DevPrivateRoute.propTypes = {
  component: PropTypes.oneOfType([
    PropTypes.func,
    PropTypes.shape()
  ]).isRequired,
  currentUserState: PropTypes.shape().isRequired
}

const mapStateToProps = (state) => ({
  currentUserState: state.currentUser
})

export default connect(mapStateToProps)(DevPrivateRoute)
