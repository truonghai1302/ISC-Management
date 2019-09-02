import { Observable } from "rxjs";
import { SubjectService } from "../../services/subject.service";
import { Subject } from "../../models/subject";
import { Component, OnInit } from "@angular/core";
import { Router } from '@angular/router';


@Component({
  selector: 'app-subject',
  templateUrl: './subject.component.html',
  styleUrls: ['./subject.component.scss']
})
export class SubjectComponent implements OnInit {
  subjects: Observable<Subject[]>;
  
  constructor(private subjectService: SubjectService,
    private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.subjects = this.subjectService.getSubjectList();
  }

  deleteSubject(id: number) {
    this.subjectService.deleteSubject(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  subjectDetails(id: number){
    this.router.navigate(['subject/details', id]);
  }
}
