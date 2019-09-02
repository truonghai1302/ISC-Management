import { Component, OnInit, Input } from '@angular/core';
import { SubjectService } from '../../../services/subject.service';
import { Router, ActivatedRoute } from '@angular/router';
import { Subject } from '../../../models/subject';


@Component({
  selector: 'app-subject-details',
  templateUrl: './subject-details.component.html',
  styleUrls: ['./subject-details.component.scss']
})
export class SubjectDetailsComponent implements OnInit {

  id: number;
  subject: Subject;

  constructor(private route: ActivatedRoute,private router: Router,
    private subjectService: SubjectService) { }

  ngOnInit() {this.subject = new Subject();

    this.id = this.route.snapshot.params['id'];
    
    this.subjectService.getSubject(this.id)
      .subscribe(data => {
        console.log(data)
        this.subject = data;
      }, error => console.log(error));
  }

  updatesub(): void {
    this.subjectService.updateSubject(this.subject,this.id).subscribe(()=>this.listsub());
  }
  
  listsub(){
    this.router.navigate(['subject']);
  }
}
