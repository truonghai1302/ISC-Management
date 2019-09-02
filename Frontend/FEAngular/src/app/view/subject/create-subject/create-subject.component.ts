import { SubjectService } from '../../../services/subject.service';
import { Subject } from '../../../models/subject';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-subject',
  templateUrl: './create-subject.component.html',
  styleUrls: ['./create-subject.component.scss']
})
export class CreateSubjectComponent implements OnInit {

  subject: Subject = new Subject();
  submitted = false;

  constructor(private subjectService: SubjectService,
    private router: Router) { }

  ngOnInit() {
  }

  newSubject(): void {
    this.submitted = false;
    this.subject = new Subject();
  }

  savesub() {
    this.subjectService.createSubject(this.subject)
      .subscribe(data => console.log(data), error => console.log(error));
    this.subject = new Subject();
    this.gotoListsub();
  }

  onSubmitsub() {
    this.submitted = true;
    this.savesub();    
  }

  gotoListsub() {
    this.router.navigate(['/subject']);
  }
}
