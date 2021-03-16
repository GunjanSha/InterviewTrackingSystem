
import './App.css';
import { ToastContainer,toast  } from 'react-toastify';
  import Header from "./component/Header"
 import {Button, Col, Container, Row } from 'reactstrap';
import Menus from './component/Menus';
import Home from './component/Home';
import  {BrowserRouter as Router, Route} from 'react-router-dom';
import Candidate from './component/candidate';
import employees from './component/employees';
import Panel from './component/Panel';
import AboutUs from './component/AboutUS';
import Contact from './component/Contact';
import CreateInterviewComponent from './component/CreateInterviewComponent';
import ListInterviewComponent from './component/ListInterviewComponent'


function App() {

    const notify = () => toast.success("You can Add ,Delete Update and View data ! ",{position:"bottom-right"});

    return (
     
      <div>
       <Router>
       <Container>
          <Header/>
         < Button color="success" outline onClick={notify} block size="lg">Here You Can Modify Data </Button>
          <ToastContainer/>
          <br/>
          <Row>
            <Col md={2}> 
              <Menus/>
            </Col>
            <Col md={10}>
              <Route path ='/' component={Home} exact />
              <Route path='/About' component={AboutUs}/>
              <Route path ='/Contact' component={Contact}/>
              <Route path ='/candidate' component={Candidate} exact/>
              <Route path ='/employees' component={employees} exact/>
              <Route path ='/Panel' component={Panel} exact/>
              <Route path = "/schedule" component = {ListInterviewComponent}></Route>
              <Route path = "/add-interview/:i_id" component = {CreateInterviewComponent}></Route>

            </Col>
          </Row>
          </Container>
       </Router>
      </div>
     
  );
}

export default App;
