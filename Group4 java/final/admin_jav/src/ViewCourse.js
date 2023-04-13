import React, { useState, useEffect } from 'react';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';
import Table from 'react-bootstrap/Table';
import { Link} from "react-router-dom";

function ViewCourse() {
  const [courses, setCourse] = useState([]);
  useEffect(() => {
    fetch("http://localhost:8060/api/Course")
      .then(res => res.json())
      .then((result) => { setCourse(result); }
      );
  }, []);

  return (

    <div><br/>
        <Link to='/AdminHome'>back</Link>
      <Container>
        <Row>
          <Col><br/>
            <h3 align="center" >Course Table</h3><br/>
            <Table striped bordered hover size="sm">
              <thead >
                <tr>
                  <th>Course ID</th>
                  <th>Course Name</th>
                  <th>Course Modules</th>
                  <th>Course Fees</th>
                  <th>Course Duration</th>
                </tr>
              </thead>
              <tbody>
              {courses.map(course => (
                <tr key={course.courseId}>

                  <td>{course.courseId}</td>

                  <td>{course.courseName}</td>
                  
                  <td>{course.courseModule}</td>
                  <td>{course.courseFees}</td>
                  <td>{course.duration}</td>
                </tr>
              ))}
            </tbody>
          </Table>
        </Col>
      </Row>
    </Container>
            </div >
            );
}
export default ViewCourse;