SELECT a.request_id AS 요청번호
      ,A.acquisition_id AS 수서등록번호
      ,A.acquisition_status AS 수서상태
      ,A.manager_id as 담당자
      ,R.user_id as 요청자
      ,R.request_type AS 요청유형
      ,R.request_status as 요청상태
      ,R.title as 서명
      ,R.author as 저자
      ,R.publisher as 출판사
      ,R.book_volume as 권
      ,R.regdt AS 요청일
  FROM acquisition A
  LEFT OUTER JOIN request R
 on a.request_id = r.request_id;
 
 SELECT o.acquisition_id AS 수서등록번호
       ,o.order_id AS 주문번호
       ,A.request_id as 요청번호
       ,o.supplier_id AS 공급자
       ,o.quantity AS 구매수량
       ,o.price AS 금액
       ,A.acquisition_status AS 수서상태
       ,A.regdt as 수서등록일
   FROM orderlist o
   LEFT OUTER JOIN acquisition A
  on o.acquisition_id = a.acquisition_id;
  
   SELECT D.request_id
         ,D.donation_id
         ,D.donor_id
         ,R.user_id
         ,R.title
         ,R.author
         ,R.publisher
         ,R.book_volume
         ,R.request_type
         ,R.request_status
         ,R.regdt
     FROM donation D LEFT OUTER JOIN request R
       on d.request_id = r.request_id;