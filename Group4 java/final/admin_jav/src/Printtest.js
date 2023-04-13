import {useEffect, useState } from "react";
import React from "react";
import {Formik,Form,Field,ErrorMessage} from "formik";
import * as yup from "yup";
import { useNavigate , Link} from "react-router-dom";
import PrintData from './Print';
import Batches from "./Batches";

function Printtest()
{
   const [formData,setformData] = useState({StudentName:"" ,Gender:"",termsAndCond:false,ResidentialAddress:"",Mobile:"",EmailId:"",Qualification:"",startigDate:"",StudentImage:"",BatchId:"" });
   const [courses, setCourses] = useState([]);
  const [batches, setBatches] = useState([]);
  const [selectedCourse, setSelectedCourse] = useState('');
  const [selectedBatch, setSelectedBatch] = useState('');


   const handleChange = (event) => {
   selectedCourse(event.target.value);
      setformData(event.target.value);
    }

    // useEffect(() => {
    //   fetch("http://localhost:8060/api/Course/")
    //     .then(response => response.json())
    //     .then(data => setCourses(data))
    //     .catch(error => console.error(error));
    // }, []);

    useEffect(() => {
  //if (selectedBatch !== '') {
    fetch(`http://localhost:8060/api/Batch/`)
      .then(response => response.json())
      .then(data => setBatches(data))
      .catch(error => console.error(error));
    //}
  // else {
  //   setBatches([]);
  // }
},
     [selectedCourse]);
  
    
    
    
  
    // const handleCourseChange = (event) => {
    //   setSelectedCourse(event.target.value);
    //   console.log(event.target.value);
     
    // };
  
    const handleBatchChange = (event) => {
      setSelectedBatch(event.target.value);
      console.log(event.target.value);
    };
  
  
    // const course = [
    //   { value:"LittleChamp", label:"Little Champ"},
    //   {value : "CompChamp", label:"Comp Champ" },
    //   {value : "MScIt", label:"MScIt"},
    //   {value : "Dac",label: "PG DAC"},
    //   {value : "Dbda",label:"PG Dbda"},
    //   {value :"SeniorCitizensCourse",label:"Senior Citizens Course"}
    // ];
   
    
    // const batches = {
    //   LittleChamp: [
    //     { value: "1", label: "LittleChamp Batch1" },
    //     { value: "2", label: "LittleChamp Batch2" }
    //   ],
    //   CompChamp: [
    //     { value: "3", label: "CompChamp Batch1" },
    //     { value: "4", label: "CompChamp Batch2" }
    //   ],
    //   MScIt: [
    //     { value: "5", label: "M.ScIt Batch1" },
    //     { value: "6", label: "M.ScIt Batch2" }
    //   ],
    //   SeniorCitizensCourse: [
    //     { value: "7", label: " SeniorCitizensCourse Batch1" },
    //     { value: "8", label: " SeniorCitizensCourse Batch2" }
    //   ],
    //   Dac: [
    //     { value: "9", label: "PG Dac Batch1" },
    //     { value: "10", label: "PG Dac Batch2" }
    //   ],
    //   Dbda: [
    //     { value: "11", label: "PG Dbda Batch1" },
    //     { value: "12", label: "PG Dbda Batch2" }
    //   ]
    // };
   
    const [reg, setreg] = useState({});
   let navigate = useNavigate();
   const handleChange1 = (event) => {
       const name = event.target.name;
       const value = event.target.value;
       setreg(values => ({ ...values, [name]: value }))
   }
   const handleSubmit = (event) => {
      //let demo = JSON.stringify(reg);
      const demo =JSON.stringify({...reg,
        batchId:selectedBatch
      })
      fetch("http://localhost:8060/api/addStudent/",{
          method: 'POST',
          headers: { 'Content-type': 'application/json' },
          body: demo
      }).then(r => { console.log(r.json()) })
       navigate('/Payment');
      event.preventDefault();
   }
   const defaultValue={
      studentName:"" ,
       dateOfBirth:"",
       gender:"",
       termsAndCond:false,
       resAddress:"",
       mobile:"",
       emailId:"",
       qualification:"",
       batchid:"",
      // courseStudentId:"",
       studentImage:""
       
    }
    const validationSchema = yup.object().shape({
      studentName: yup.string().min(2, 'Too Short!')
       .max(15, 'should not exceed 15 character!').required(""),
       gender: yup.string().required(""),
       dateOfBirth: yup.string().required(""),
       emailId: yup.string().required("Please enter your email").email("please enter valid email"),
       resAddress: yup.string().required(""),
       termsAndCond:yup.boolean().oneOf([true],""),
       mobile: yup.string() .matches(/^[0-9]+$/, "Must be only digits").min(10, "mobile number must be 10 digit at minimum").required(""),
       qualification:yup.string().max(30,"should not exceed 30 charcters").required(""),
       studentImage: yup.string().required(""),
       batchid:yup.string().required("")
    
   })

   function handleMultipleChanges(event) {
      handleChange(event);
      handleChange1(event);
    }
       
    
    return(
        <div>
           <Link to='/AdminHome'>back</Link> 

        <h1 style={{textAlign:"center"}}>Student Registration Form</h1>
        <div className="container">
        <div className="col-md-12-text-center mt-5">
        <div className="regis">
         
        <Formik initialValues={defaultValue} validationSchema={validationSchema}
          onSubmit={handleSubmit} >
            <Form onSubmit={handleSubmit}>
              
            <label>Name</label> <Field type="text" name="studentName" placeholder="Enter Your Name" value={reg.studentName} onChange={handleChange1} className="form-control" required/>
         <p className="text-danger">
            <ErrorMessage name="studentName" />
         </p>
         <label>DOB</label> <Field type="date" name="dateOfBirth" placeholder="Enter Your Birthdate" value={reg.dateOfBirth} onChange={handleChange1} className="form-control" required/>
         <p className="text-danger">
            <ErrorMessage name="dateOfBirth" />
         </p>
         <label>gender</label>    <Field component="select" name="gender" placeholder="select your gender" value={reg.gender} onChange={handleChange1} className="form-control" required>

                <option value="" disable>Please Select</option>
                <option value="male">Male</option>
                <option value="female">Female</option>
                <option value="transGender">TransGender</option>
            </Field>
            <p className="text-danger">
            <ErrorMessage name="gender" />
         </p>
         <label>Res address</label> <Field type="text" name="resAddress" placeholder="Enter Your Address" value={reg.resAddress} onChange={handleChange1} className="form-control" />
         <p className="text-danger">
            <ErrorMessage name="resAddress" />
         </p>
         <label>mobile</label> <Field type="number" name="mobile" placeholder="Enter Your MobileNo" value={reg.mobile} onChange={handleChange1} className="form-control" />
         <p className="text-danger">
            <ErrorMessage name="mobile" />
         </p>
         <label>Email</label> <Field type="text" name="emailId" placeholder="Enter Your email" value={reg.emailId}  onChange={handleChange1} className="form-control"/>
         <p className="text-danger">
            <ErrorMessage name="emailId" />
         </p>
         <label>qualification</label> <Field type="text" name="qualification" placeholder="Enter your qualification" value={reg.qualification} onChange={handleChange1} className="form-control" /> 
         <p className="text-danger">
            <ErrorMessage name="qualification"/>
         </p>
         
         <label>Upload Image</label> <Field type="file" name="studentImage"  value={reg.studentImage} onChange={handleChange1} className="form-control"></Field>
         <p className="text-danger">
            <ErrorMessage name="studentImage"/>
         </p>
          <div>
          {/* <label htmlFor="course">Course:</label>
      <select id="course" name="course" value={reg.selectedCourse} onChange={handleCourseChange}>
        <option value="">Select a course</option>
        {courses.map(course => (
          <option key={course.courseId} value={course.courseId}>{course.courseName}</option>
        ))}
      </select> */}

      {/* {selectedCourse !== '' && ( */}
        <>
          <br />

          <label htmlFor="batch">Batch:</label>
          <select id="batch" name="batch" value={reg.selectedBatch} onChange={handleBatchChange}>
            <option value="">Select a batch</option>
            {batches.map(batch => (
              <option key={batch.batchId} value={batch.batchId}>{batch.batchName}</option>
            ))}

          </select>

        </>
      {/* )} */}
      
    </div> 
   
        <div className="col-md-12 mt-4">
            <label className="form-inline">
            <Field type="checkbox" name="termsAndCond" required></Field>
            I accept terms and conditions
            </label>
            <p className="text-danger">
            <ErrorMessage name="termsAndCond" />
         </p>
         </div>
       <button className="btn btn-primary" type="submit">
            Submit
    </button> &nbsp;
    <button className="btn btn-primary" onClick={() => window.print()}>Print Form Data</button>
      <PrintData formData={formData} />
            </Form>
        </Formik>
        </div>
        </div>
        </div>
        </div>
        
    )       
}
export default Printtest;