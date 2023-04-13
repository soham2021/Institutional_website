import React from 'react';
//import LoginImage from './Image3.jpeg';
import { useState } from 'react';
import {
  MDBBtn,
  MDBContainer,
  MDBCard,
  MDBCardBody,
  MDBCardImage,
  MDBRow,
  MDBCol,
  MDBIcon,
  MDBInput
}
from 'mdb-react-ui-kit';
import { useNavigate } from 'react-router-dom';

function Login() {
  
  const regex2=/^[a-zA-Z0-9!@#$%^&*]{6,20}$/;
  const [credential, setCredential] = useState({});
  const [error1,setError1]=useState('');
  const [error2,setError2]=useState('');
 
  //const { code } = useParams();
   let navigate = useNavigate();
    const handleChange = (event) => {
     const name = event.target.name;
      const value = event.target.value;
      // if(regex1.test(value)===false || regex2.test(value)===false)
      // {
      //   console.log("in handlchang")
      //   setError1('Please Enter Valid Email Id or password');
      //   //setCredential(values => ({ ...values, [name]: value }))
      //   //console.log(credential)

        
      // }
      // else
      // {
      //   setError1(' ');
      //   console.log("in handlchang correct")
      //   setCredential(values => ({ ...values, [name]: value }))
      //   //setCredential(values => ({ ...values, [name]: value }))
      //   console.log(credential)
      //   return true;
      // }

      if (name === 'password') {
        if (regex2.test(value) === false) {
          setError2('Please enter a valid password (6-20 characters)');
          return false;
        } else {
          setError2('');
        }
      }
      setCredential(values => ({ ...values, [name]: value }));
      return true;
      }

      
      const handleSubmit = (e) => {
        console.log("hello");
        console.log("credential");
        console.log(credential);
      let demo = JSON.stringify(credential);
      console.log(JSON.parse(demo)); 
      fetch("http://localhost:8060/api/login/" , {
      method: 'POST',
      headers: { 'Content-type': 'application/json' },
      body: demo
      }).then((response) => response.json())
      .then((data) => {
        console.log("hello");
        console.log(data);

        if(data.success)
        {
          alert("Login Succeessful..");
           navigate('/AdminHome')
         
        }
        else
        {
          alert("Please enter valid credentials");
        // navigate('/Registartion');
        }
        
     });


      e.preventDefault();
    
      //alert(credential);

       
    
       
        
    }
  return (
    <MDBContainer className="my-5" >

      <MDBCard style={{width:'800px', height:'500px'}} >
        <MDBRow className='g-0'>

          <MDBCol md='6'>
          {/* <MDBCardImage src={LoginImage} alt="login form" className='rounded-start w-100'  style={{ width: '200px', height: '499px' }}/> */}

          </MDBCol>

          <MDBCol md='6'>
            <MDBCardBody className='d-flex flex-column'>

              {/* <div className='d-flex flex-row mt-2'>
                <MDBIcon fas icon="cubes fa-3x me-3" style={{ color: '#ff6219' }}/>
                <span className="h1 fw-bold mb-0" align='center'>Logo</span>
              </div> */}

              <h5 className="fw-normal my-4 pb-3" style={{letterSpacing: '1px'}}>Admin Login</h5>
                <label>User Name</label>
                <MDBInput wrapperClass='mb-4'  id='formControlLg' type='text' name='userName' size="lg" placeholder="Enter User Name" style={{width:'300px', height:'20px'}} onChange={handleChange}/>
                
                <label>Password</label>
                <MDBInput wrapperClass='mb-4'  id='formControlLg1' type='password' size="lg" name='password' placeholder="Enter Password" style={{width:'300px', height:'20px'}} onChange={handleChange}/>
                <p><b>{error2}</b></p>

              <MDBBtn className="mb-4 px-5" color='dark' size='lg'  style={{width:'300px'}} onClick={handleSubmit}>Login</MDBBtn>
              {/* <a className="small text-muted" href="#!">Forgot password?</a> */}
              {/* <p className="mb-5 pb-lg-2" style={{color: '#393f81'}}>Don't have an account? <a href="/Registration/" style={{color: '#393f81'}}>Register here</a></p> */}

              <div className='d-flex flex-row justify-content-start'>
                <a href="#!" className="small text-muted me-1">Terms of use.</a>
                <a href="#!" className="small text-muted">Privacy policy</a>
              </div>

            </MDBCardBody>
          </MDBCol>

        </MDBRow>
      </MDBCard>

    </MDBContainer>
  );
}

export default Login;