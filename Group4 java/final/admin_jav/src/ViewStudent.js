import React, { useState, useEffect } from 'react';
import Table from 'react-bootstrap/Table';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import { useParams } from 'react-router-dom';
import { useNavigate,Link} from "react-router-dom";


function ViewStudent() {
  const [stud, setStudent] = useState([]);
  const{batchId}=useParams();
  useEffect(() => {
    fetch("http://localhost:8060/api/StudentById/"+batchId)
      .then(res => res.json())
      .then((result) => { setStudent(result); }
      );
      
  }, []);
  return (
    <div>
      <Container>
      <Row>
        <Col>
        <Link to='/AdminHome'>back</Link>
        <h3 align="center" >Students Details</h3>
      <Table striped bordered hover size="sm">
        <thead>
          <tr>
            <th>Student ID</th>
            <th>Student Name</th>
            <th>Date Of Birth</th>
            <th>Gender</th>
            <th>Address</th>
            <th>Mobile</th>
            <th>EmailId</th>
            <th>Qualification</th>
            <th>Course Enrolled</th>
            <th>BatchId</th>
          </tr>
        </thead>
        <tbody>
         
          {stud.map(student => (
            <tr key={student.studentId}>

              <td>{student.studentId}</td>

              <td>{student.studentName}</td>

              <td>{student.dateOfBirth}</td>

              <td>{student.gender}</td>

              <td>{student.resAddress}</td>

              <td>{student.mobile}</td>

              <td>{student.emailId}</td>

              <td>{student.qualification}</td>

              <td>{student.batchId}</td>
              
            </tr>
          ))}
        </tbody>
      </Table>
        </Col>
      </Row>
    </Container>
    </div>
  );
}
export default ViewStudent;