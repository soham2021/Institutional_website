import {useState } from "react";
import React from "react";
import {Formik,Form,Field,ErrorMessage} from "formik";
// import { useNavigate} from "react-router-dom";
import * as yup from "yup";

function NewBatch()
{
     
    const [reg, setreg] = useState({});
   const handleChange1 = (event) => {
       const name = event.target.name;
       const value = event.target.value;
       setreg(values => ({ ...values, [name]: value }))
       console.log("values fetching");
   }
   const handleSubmit = (event) => {
    console.log("values fetched");
      let demo = JSON.stringify(reg);
      fetch("http://localhost:8060/api/addBatch/",{
          method: 'POST',
          headers: { 'Content-type': 'application/json' },
          body: demo
      }).then(r => { console.log(r.json()) })
     // event.preventDefault();
   }
    const defaultValue={
       batchName:"" ,
       isBatchActive:false,
       startDate:"",
       endDate:"",
      finalpresentationDate:"",
       totalHours:"",
       batchFee:"",
       courseBatchId:""
    }
   const validationSchema = yup.object().shape({
   batchName: yup.string().required("mandatory field"),
   isBatchActive:yup.boolean().required("mandatory field"),
   startDate:yup.date().required("mandatory field"),
   endDate:yup.date().required("mandatory field"),
  finalpresentationDate:yup.date().required("mandatory field"),
  totalHours:yup.number().required("mandatory field"),
  batchFee:yup.number().required("mandatory field"),
  courseBatchId:yup.number().required("mandatory field")

   })
    
    return(
        
        <div className="container">
        <div className="col-md-12-text-center mt-5">
        <div className="regis">
         <h1 style={{textAlign:"center"}}> Batch Details</h1>
        <Formik initialValues={defaultValue} 
          onSubmit={handleSubmit} >
            <Form onSubmit={handleSubmit} className="form-control">
            
            <div>    
        <label>Batch Name</label> <Field type="text" name="batchName" placeholder="Enter Batch Name" value={reg.batchName} onChange={handleChange1} className="form-control" required/>
         <p className="text-danger">
            <ErrorMessage name="batchName" />
         </p>
         </div>

         <br></br>
         <div>
         <label>Batch Status</label>    <Field component="select" name="isBatchActive" placeholder="select" value={reg.isBatchActive} onChange={handleChange1} className="form-control" >

                <option value="" disable>Please Select</option>
                <option value="true">Active</option>
                <option value="false">Inactive</option>
            </Field>
            <p className="text-danger">
            <ErrorMessage name="isBatchActive" />
         </p>
        </div>
        <br></br>
        <div>
         <label>Starting Date</label> <Field type="date" name="startDate" placeholder="" value={reg.startDate} onChange={handleChange1} className="form-control"/>
         <p className="text-danger">
            <ErrorMessage name="startDate" />
         </p>
         </div>
         <br></br>
         <div>
         <label>Ending Date</label> <Field type="date" name="endDate" placeholder="" value={reg.endDate} onChange={handleChange1} className="form-control"/>
         <p className="text-danger">
            <ErrorMessage name="endDate" />
         </p>
         </div>
         <br></br>
         <div>
         <label>Final Presentation Date</label> <Field type="date" name="finalpresentationDate" placeholder="" value={reg.finalpresentationDate} onChange={handleChange1} className="form-control"/>
         <p className="text-danger">
            <ErrorMessage name="finalpresentationDate" />
         </p>
         </div>
         <br></br>
         <div>
         <label>Total Course Hours</label> <Field type="text" name="totalHours"  value={reg.totalHours} onChange={handleChange1} className="form-control"></Field>
         <p className="text-danger">
            <ErrorMessage name="totalHours" />
         </p>
         </div>
         <br></br>
         <div>
         <label>Total Course Fees</label> <Field type="text" name="batchFee"  value={reg.batchFee} onChange={handleChange1} className="form-control" required></Field>
         <p className="text-danger">
            <ErrorMessage name="batchFee" />
         </p>
         </div>
         <br></br>
         <div>
         <label>Course Name</label>    <Field component="select" name="courseBatchId" placeholder="select" value={reg.courseBatchId} onChange={handleChange1} className="form-control" required>

        <option value="" disable>Please Select</option>
        <option value="1">Dac</option>
        <option value="3">Dbda</option>
        <option value="4">Senior Citizen Course</option>
        <option value="5">Comp Champ</option>
        <option value="6">Little Champ</option>
        <option value="7">MS-CIT</option>
         </Field>
         <p className="text-danger">
            <ErrorMessage name="courseBatchId" />
         </p>

         </div> 

       <button className="btn btn-primary" type="submit">
            Submit
    </button>
            </Form>
        </Formik>
   
        </div>
        </div>
        </div>
        
    )       
}
export default NewBatch;