import React from 'react';
import  {  useState, useEffect,useParams } from "react";
import Container from 'react-bootstrap/esm/Container';
import Row from 'react-bootstrap/esm/Row';
import Col from 'react-bootstrap/esm/Col';
import Table from 'react-bootstrap/esm/Table';
import { Link} from "react-router-dom";


function ViewStaff(){
    const [staffdata,setStaffdata] = useState([]);
    
    useEffect(() => {
        fetch("http://localhost:8060/api/Staffs")
        .then(res => res.json())
        .then((result) => { setStaffdata(result); }
        );
    }, []);

    return (
        <div><br/><br/><br/> <Container>
        <Row>
          <Col>
            <h2 align="center" id="h2dac"><b>Staff Details</b></h2>
            <Link to='/AdminHome'>back</Link>

            <br/><br/> <button type="btn btn-primary" ><a href="Staff">Add New Staff</a></button><br/><br/>
            <Table striped bordered hover size="sm">
            <thead>
          <tr>
            <th>Staff ID</th>
            <th>Staff Name</th>
            <th>Qualification</th>
            <th>Experience</th>
            <th>Staff Image</th>
          
          </tr>
        </thead>
        <tbody>
         
          {staffdata.map(staffs => (
            <tr key={staffs.staffId}>

              <td><b>{staffs.staffId}</b></td>

              <td><b>{staffs.staffName}</b></td>

              <td><b>{staffs.qualification}</b></td>

              <td><b>{staffs.experience}</b></td>

              <td><img src={"/images/prisha.jpg"}/></td>

            </tr>
          ))}
        </tbody>
         </Table>
        </Col>
      </Row>
    </Container> </div>
    );
}

export default ViewStaff;