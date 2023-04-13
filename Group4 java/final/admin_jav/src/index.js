import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import AdminLogin from './AdminLogin';
import AdminHome from './AdminHome';
import Enquiry from './Enquiry';
import FollowUp from './FollowUp';
import Staff from './Staff';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min';
import Printtest from './Printtest';
import Batches from './Batches';
import ViewStudent from './ViewStudent';
import NewBatch from './NewBatch';
import GalleryImages from './GalleryImages';
import GalleryVideos from './GalleryVideos';
import GalleryAlbum from './GalleryAlbum';
import Placement from './Placement';
import Payment from './Payment';
import ViewStaff from './ViewStaff';
import Login from './Login';
import ViewCourse from './ViewCourse';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
    <Routes>

      <Route path="/" element={<App />} ></Route>
      <Route path="/AdminLogin" element={<Login/>} ></Route>
      <Route path="/AdminHome" element={<AdminHome />} ></Route>
      <Route path="/Enquiry" element={<Enquiry />} ></Route>
      <Route path="/FollowUp" element={<FollowUp />} ></Route>
      <Route path="/ViewStaff" element={<ViewStaff />} ></Route>
      <Route path="/Printtest" element={<Printtest />} ></Route>
      <Route path="/Payment" element={<Payment />} ></Route>
      <Route path="/Batches" element={<Batches />} ></Route>
      <Route path="/viewstudent/:batchId" element={<ViewStudent/>} ></Route>
      <Route path="/NewBatch" element={<NewBatch />} ></Route>
      <Route path="/GalleryImages" element={<GalleryImages />} ></Route>
      <Route path="/GalleryVideos" element={<GalleryVideos />} ></Route>
      <Route path="/GalleryAlbum" element={<GalleryAlbum/>} ></Route>
      <Route path="/Placement" element={<Placement/>} ></Route>
      <Route path="/Staff" element={<Staff/>} ></Route>
      <Route path="/ViewCourse" element={<ViewCourse/>} ></Route>
        </Routes>
        </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
