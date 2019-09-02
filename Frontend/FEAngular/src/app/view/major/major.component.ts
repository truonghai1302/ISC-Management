import { Component, OnInit } from '@angular/core';
import { Major } from 'src/app/models/major';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { MajorService } from 'src/app/services/major.service';
import { PagerService } from 'src/app/services/pager.service';


@Component({
  selector: 'app-major',
  templateUrl: './major.component.html',
  styleUrls: ['./major.component.scss']
})
export class MajorComponent implements OnInit {

  majors: Observable<Major[]>;

  // pager object
  pager: any = {};

  // paged items
  pagedItems: Array<any>;

  maxPage: number;

  constructor(private majorService: MajorService,
    private router: Router,
    private pagerService: PagerService) {}
    
  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.majors=this.majorService.getMajorList();
    //.subscribe(data => {
      //this.majors = data;
      //console.log(data);
      //this.majors=data;
      //this.maxPage = this.majors.length;
      //this.setPage(1);

    //});
  }

  deleteMajor(id: number) {
    this.majorService.deleteMajor(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  setPage(page: number) {
    // get pager object from service
    this.pager = this.pagerService.getPager(this.maxPage, page);

    // get current page of items
    //this.pagedItems = this.majors.slice(this.pager.startIndex, this.pager.endIndex + 1);
  }

  majorDetails(id: number){
    this.router.navigate(['major/details', id]);
  }
  /*onChangePage(pageOfItems: Array<any>) {
    // update current page of items
    this.pageOfItems = pageOfItems;
}*/

}
