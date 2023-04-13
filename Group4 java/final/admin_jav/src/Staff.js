import { useState } from "react";
import {Formik , Form, Field} from "formik";
 //import * as yup from "yup";
import './Staff.css';
import { Link } from 'react-router-dom';
 import { useNavigate} from "react-router-dom";


function Staff() {

const [stf, setStf] = useState({});
  // let navigate = useNavigate();

  const handleChange = (event) => {
    const name = event.target.name;
    const value = event.target.value;
    setStf(values => ({ ...values, [name]: value }))
}
  
    const handleSubmit = (event) => {
      let demo = JSON.stringify(stf);
      fetch("http://localhost:8060/api/Staffs/",{
          method: 'POST',
          headers: { 'Content-type': 'application/json' },
          body: demo
      }).then(r => r.json());
      //navigate('/');
    // event.preventDefault();
   }



//-----end Validation

    return (

        <div className='staffdiv'>
             <Link to='/AdminHome'>back</Link>
             <h3 style={{ textAlign: 'center',paddingTop:'2em'}}>Staff Form</h3>
           <p style={{ paddingLeft:'4em',color:'red'}}>* required field</p>
            
            <Formik>
                <Form className='staff' onSubmit={handleSubmit}>
                    
                     
                   
                  {/* StaffName */}
                    <label>Staff Name</label><Field type="text" name="staffName" placeholder="Enter your name" value={stf.staffName} onChange={handleChange} className="form-control" />
                    

                 {/* Qualification */}
                    <label>Qualification</label><Field type="text" name="qualification" placeholder="Enter your Qualification" value={stf.qualification} onChange={handleChange} className="form-control" />
                    

                    {/* Experience */}
                    <label>Experience</label><Field type="text" name="experience" placeholder="Enter your Experience" value={stf.experience} onChange={handleChange} className="form-control" />
                   
          
                  {/* Contact */}
                  <label>Contact</label><Field type="number" name="mobile" placeholder="Enter your contact" value={stf.mobile} onChange={handleChange} className="form-control" />
                  
            

                    {/* StaffImage */}
                  <label>StaffImage</label><Field type="file" name="staffImage" placeholder="Select File" value={stf.staffImage} onChange={handleChange} className="form-control" />
                    
          
 
                  
           <button className="btn btn-primary" type="submit">submit</button>

                </Form>
            </Formik>


        </div> 
    )
}
export default Staff;

