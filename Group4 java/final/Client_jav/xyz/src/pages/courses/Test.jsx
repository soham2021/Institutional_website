import Table from 'react-bootstrap/Table';
import React, { useState, useEffect } from 'react';
import Container from 'react-bootstrap/Container';
import Row from 'react-bootstrap/Row';
import Col from 'react-bootstrap/Col';

function Test() {
  const [batches, setCourse] = useState([]);
  useEffect(() => {
    fetch("https://localhost:7005/api/batches/")
      .then(res => res.json())
      .then((result) => { setCourse(result); }
      );
  }, []);

  return (
    <div>
      <Container>
      <Row>
        <Col>
        <h3 align="center" >Batch Details</h3>
        
        
      <Table striped bordered hover size="sm">
        <thead>
          <tr>
            <th>Batch ID</th>
            <th>Batch Name</th>
            <th>StartDate</th>
            <th>EndDate</th>
            <th>Presentation</th>
            <th>Course Hours</th>
          </tr>
        </thead>
        <tbody>
          {batches.map(batch => (
            <tr key={batch.batchId}>

              <td>{batch.batchId}</td>

              <td>{batch.batchName}</td>

              <td>{batch.startDate}</td>

              <td>{batch.endDate}</td>

              <td>{batch.finalPresentationDate}</td>

              <td>{batch.totalCourseHours}</td>

              <td> <a href={'/viewstudent/'+batch.batchId}>View Students</a></td>
              <td> <a href={'/editbatch/' +batch.batchId}>Edit Batch</a></td>

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
export default Test;