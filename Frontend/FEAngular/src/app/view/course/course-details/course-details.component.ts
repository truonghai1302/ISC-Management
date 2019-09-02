import { Component, OnInit } from '@angular/core';
import { Course } from 'src/app/models/course';
import { ActivatedRoute, Router } from '@angular/router';
import { CourseService } from 'src/app/services/course.service';

@Component({
  selector: 'app-course-details',
  templateUrl: './course-details.component.html',
  styleUrls: ['./course-details.component.scss']
})
export class CourseDetailsComponent implements OnInit {

  id: number;
  course: Course;

  constructor(private route: ActivatedRoute,private router: Router,
    private courseService: CourseService) { }

  ngOnInit() {this.course = new Course();

    this.id = this.route.snapshot.params['id'];
    
    this.courseService.getCourse(this.id)
      .subscribe(data => {
        console.log(data)
        this.course = data;
      }, error => console.log(error));
  }

  update(): void {
    this.courseService.updateCourse(this.course,this.id).subscribe(()=>this.list());
  }
  
  list(){
    this.router.navigate(['course']);
  }
}
