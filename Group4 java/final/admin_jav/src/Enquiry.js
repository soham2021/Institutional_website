
import { useState } from "react";
import {Formik , Form, Field,ErrorMessage} from "formik";
import * as yup from "yup";
import './Enquiry.css';
import { useNavigate,Link} from "react-router-dom";
import staff from './Staff';

function Enquiry() {
  const [enq, setEnq] = useState({});
  // let navigate = useNavigate();

  const handleChange = (event) => {
    const name = event.target.name;
    const value = event.target.value;
    setEnq(values => ({ ...values, [name]: value }))
}
  
    const handleSubmit = (event) => {
      let demo = JSON.stringify(enq);
      fetch("http://localhost:8060/api/Enquiries/",{
          method: 'POST',
          headers: { 'Content-type': 'application/json' },
          body: demo
      }).then(r => r.json());
      //navigate('/');
    // event.preventDefault();
   }

  //  const handleSubmit = event => {
  //   //event.preventDefault();
  //   fetch("http://localhost:8080/api/Enquiries/", {
  //     method: 'POST',
  //     headers: { 'Content-Type': 'application/json' },
  //     body: JSON.stringify(enq)
  //   })
  //   .then(response => response.json())
  //   .then(data => console.log(data))
  //   .catch(error => console.log(error));
  // }


  
    return (

      <div className='enquirydiv'>
        <Link to='/AdminHome'>back</Link>
      <h3 style={{ textAlign: 'center',paddingTop:'2em'}}>Enquiry Form</h3>
      <p style={{ paddingLeft:'4em',color:'red'}}>* required field</p>
            
            <Formik>
                <Form className='enquiry' onSubmit={handleSubmit}>
                    
                    {/* EnquirerName */}
           <label>EnquirerName</label><Field type="text" name="enquirerName" placeholder="Enter your enquirer name" value={enq.enquirerName} onChange={handleChange} className="form-control" />
         
                   {/* StudentName */}
           <label>Student Name</label><Field type="text" name="studentName" placeholder="Enter student name" value={enq.studentName} onChange={handleChange} className="form-control" />
               
{/* CourseId */}
<label>Course Id</label><Field type="number" name="courseId" placeholder="Enter course Id" value={enq.courseId} onChange={handleChange} className="form-control" />


               {/* EnquiryDate */}
         <label>Enquiry Date</label><Field type="date" name="date" placeholder="Select Date"  value={enq.date} onChange={handleChange} className="form-control" />
   

                   {/* mobile */}
                   <label>mobile</label><Field type="number" name="mobile" placeholder="Enter your contact number"  value={enq.mobile} onChange={handleChange} className="form-control" />
            
                        
        {/* Email Id */}
           <label>emailId</label><Field type="email" name="emailId" placeholder="Enter emailId"  value={enq.emailId} onChange={handleChange} className="form-control" />
           

                
                 {/* ClosureReason */}
         <label>Closure Reason</label><Field component="select" name="closureReason" placeholder="Query Asked"  value={enq.closureReason} onChange={handleChange} className="form-control" >
         <option value="" disable>--Select--</option>
                <option value={enq.closureReason} >Abba nahi manenge!!!!</option>
                <option value={enq.closureReason} >Humse na ho payega!!!!!</option>
                <option value={enq.closureReason} >Fees kuchh kam ho payega kya!!!</option>
                <option value={enq.closureReason} >I have changed my mind!!</option>
                <option value={enq.closureReason} >Got job opportunity!!</option>
                </Field>


                 {/* Queries */}
         <label>Queries</label><Field type="textarea" name="queries" placeholder="Query Asked"  value={enq.queries} onChange={handleChange} className="form-control" />
         
                    
       
         {/* staffId */}
         <label>Staff Name</label><Field component="select" name="staffId" placeholder="Select File"  value={enq.staffId} onChange={handleChange} className="form-control" >
         <option value="" disable>--Select--</option>
                <option value="2">Snehal</option>
                <option value="1">Prisha</option>
                <option value="3">Trupti</option>
                
               
         </Field>
                  
<button className="btn btn-primary" type="submit">Submit</button>

                </Form>
            </Formik>
        
        </div> 
    )
}
export default Enquiry;
                  
                  