import { Component, OnInit, Input } from '@angular/core';
import { StudentService } from '../../../services/student.service';
import { StudentComponent } from '../student.component';
import { Router, ActivatedRoute } from '@angular/router';
import { Student } from '../../../models/student';
import { __values } from 'tslib';


@Component({
  selector: 'app-student-details',
  templateUrl: './student-details.component.html',
  styleUrls: ['./student-details.component.scss']
})
export class StudentDetailsComponent implements OnInit {

  id: number;
  student: Student;

  constructor(private route: ActivatedRoute,private router: Router,
    private studentService: StudentService) { }

  ngOnInit() {this.student = new Student();

    this.id = this.route.snapshot.params['id'];
    
    this.studentService.getStudent(this.id)
      .subscribe(data => {
        console.log(data)
        this.student = data;
      }, error => console.log(error));
  }

  update(): void {
    this.studentService.updateStudent(this.student,this.id).subscribe(()=>this.list());
  }
  
  list(){
    this.router.navigate(['student']);
  }
}
