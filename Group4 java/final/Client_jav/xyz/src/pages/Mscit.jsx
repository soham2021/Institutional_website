//MS-cit

import React, { useState, useEffect } from 'react';
import Card from 'react-bootstrap/Card';
import 'bootstrap/dist/css/bootstrap.css';
import Table from 'react-bootstrap/Table';
import Carousel from 'react-bootstrap/Carousel';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';

function Mscit() {
  const [course, setCourse] = useState([]);
  useEffect(() => {
    fetch("http://localhost:8060/api/CourseById/6")
      .then(res => res.json())
      .then((result) => { setCourse(result); }
      );
  }, {});

  return (
    <div>
      <Container>
        <Row>
          <Col>
            <Carousel fade >
              <Carousel.Item>
                <img
                  className="d-block w-100"
                  src="assets/img/mscitlogo.png"
                  alt="First slide"
                  width={300}
                  height={400}
                />
                <Carousel.Caption>
                </Carousel.Caption>
              </Carousel.Item>
              {/* <Carousel.Item>
                <img
                  className="d-block w-100"
                  src="images/mscitsyll.jpg"
                  alt="Second slide"
                  width={300}
                  height={400}
                />

                <Carousel.Caption>


                </Carousel.Caption>

              </Carousel.Item> */}
            </Carousel>
            <Card><br/><br/>
              <Card.Header align="center" color="Dark"><h2><b>Ms-Cit</b>(Age Group-15 to 20)</h2></Card.Header>
              <Card.Body>
                <Card.Title align="center"><b>Course Details</b></Card.Title>
                <Card.Text>
                  <Table striped bordered hover>

                    <tbody>
                      {/* <tr>
                        <td>Course Id</td>
                        <td>{course.courseId}</td>
                      </tr> */}
                      <tr>
                        <td>Course Name</td>
                        <td>{course.courseName}</td>
                      </tr>
                      <tr>
                        <td>Modules</td>
                        <td>{course.courseModule}</td>
                      </tr>
                      <tr>
                        <td>Course Fees</td>
                        <td>{course.courseFees}</td>
                      </tr>
                      <tr>
                  <td>Course Duration</td>
                  <td>{course.duration}</td>
                </tr>
                    </tbody>
                  </Table>
                </Card.Text>
                <h5 align='center' opacity="0.3">*<u>Admissions are open for MS-CIT course</u></h5>
                <h7 align='right' opacity='0.1'>*For more details contact <u>Computer Seekho</u></h7>
                {/*<Button variant="primary">Go somewhere</Button>*/}
              </Card.Body>
            </Card>
          </Col>
        </Row>
      </Container>

    </div>
  );
}
export default Mscit;
