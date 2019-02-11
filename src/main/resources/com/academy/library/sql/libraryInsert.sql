set define off;
INSERT INTO code(code_id, code, code_name) VALUES (CODE_IDS.NEXTVAL, 'RQST', '요청');

insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'RQST01', 'RQST', '요청대기');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'RQST02', 'RQST', '요청유형');

insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'RQST0100', 'RQST01', '요청취소');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'RQST0101', 'RQST01', '요청진행중');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'RQST0102', 'RQST01', '요청완료');

insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'RQST0201', 'RQST02', '구입요청');
INSERT INTO code(code_id, code, code_super, code_name) VALUES (code_ids.NEXTVAL, 'RQST0202', 'RQST02', '기부요청');

insert into code(code_id, code, code_name) values (code_ids.nextval, 'BANK', '은행');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BANK01', 'BANK', 'KB국민');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BANK02', 'BANK', 'KEB하나');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BANK03', 'BANK', '우리');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BANK04', 'BANK', '신한');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BANK05', 'BANK', 'KDB산업');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BANK06', 'BANK', 'IBK기업');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BANK07', 'BANK', 'NH농협');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BANK08', 'BANK', 'SC제일');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BANK09', 'BANK', 'BNK부산');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BANK10', 'BANK', 'DGB대구');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BANK11', 'BANK', '한국씨티');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BANK12', 'BANK', 'BNK경남');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BANK13', 'BANK', 'SH수협');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BANK14', 'BANK', '광주');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BANK15', 'BANK', '전북');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BANK16', 'BANK', '제주');   

insert into code(code_id, code, code_name) values (CODE_IDS.NEXTVAL, 'INST', '소장처');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST01', 'INST', '중앙도서관');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST02', 'INST', '대덕밸리');   

insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0101', 'INST01', '000(총류)');   
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0102', 'INST01', '100(철학)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0103', 'INST01', '200(종교)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0104', 'INST01', '300(사회학)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0105', 'INST01', '400(언어)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0106', 'INST01', '500(자연과학)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0107', 'INST01', '600(기술과학)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0108', 'INST01', '700(예술)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0109', 'INST01', '800(문학)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0110', 'INST01', '900(역사)');

insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0201', 'INST02', '000(총류)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0202', 'INST02', '100(철학)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0203', 'INST02', '200(종교)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0204', 'INST02', '300(사회학)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0205', 'INST02', '400(언어)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0206', 'INST02', '500(자연과학)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0207', 'INST02', '600(기술과학)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0208', 'INST02', '700(예술)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0209', 'INST02', '800(문학)');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'INST0210', 'INST02', '900(역사)');

INSERT INTO code(code_id, code, code_name) VALUES (CODE_IDS.NEXTVAL, 'FACI', '기관');
insert into code(CODE_ID, CODE, code_super, code_name) values (code_ids.nextval, 'FACI01', 'FACI', '자유전공학부');
insert into code(CODE_ID, CODE, code_super, code_name) values (code_ids.nextval, 'FACI03', 'FACI', '사범대학');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI04', 'FACI', '문과대학');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI05', 'FACI', '경상대학');
insert into code(CODE_ID, CODE, code_super, code_name) values (code_ids.nextval, 'FACI07', 'FACI', '조형예술대학');
insert into code(CODE_ID, CODE, code_super, code_name) values (code_ids.nextval, 'FACI09', 'FACI', '공과대학');
insert into code(CODE_ID, CODE, code_super, code_name) values (code_ids.nextval, 'FACI11', 'FACI', '법정대학');
insert into code(CODE_ID, CODE, code_super, code_name) values (code_ids.nextval, 'FACI74', 'FACI', '생명나노과학대학');
insert into code(CODE_ID, CODE, code_super, code_name) values (code_ids.nextval, 'FACI50', 'FACI', '린튼글로벌비즈니스');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0101', 'FACI01', '자유전공학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0301', 'FACI03', '국어교육학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0302', 'FACI03', '영어교육학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0303', 'FACI03', '교육학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0304', 'FACI03', '역사교육과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0305', 'FACI03', '미술교육과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0306', 'FACI03', '수학교육과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0401', 'FACI04', '국어국문-창작학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0402', 'FACI04', '영어영문학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0403', 'FACI04', '일어일문학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0404', 'FACI04', '일어-프랑스어문학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0405', 'FACI04', '문헌정보학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0406', 'FACI04', '역사철학상담학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0407', 'FACI04', '기독교학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0501', 'FACI05', '경영학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0502', 'FACI05', '회계학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0503', 'FACI05', '무역학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0504', 'FACI05', '경제학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0505', 'FACI05', '비즈니스통계학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0506', 'FACI05', '컨벤션호텔경영학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0507', 'FACI05', '경영정보학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0701', 'FACI07', '융합디자인전공');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0702', 'FACI07', '회화전공');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0703', 'FACI07', '의류학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0901', 'FACI09', '컴퓨터통신무인기술학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0902', 'FACI09', '전자공학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0903', 'FACI09', '멀티미디어학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0904', 'FACI09', '건축학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0905', 'FACI09', '토목건축학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0906', 'FACI09', '산업경영학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0907', 'FACI09', '기계공학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0908', 'FACI09', '컴퓨터공학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0909', 'FACI09', '정보통신공학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0910', 'FACI09', '광센서공학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0911', 'FACI09', '멀티미디어학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI0912', 'FACI09', '건축-토목공학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI1101', 'FACI11', '법학부');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI1102', 'FACI11', '행정-경찰학부');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI1103', 'FACI11', '정치-언론-국방학부');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI1104', 'FACI11', '사회복지학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI1105', 'FACI11', '아동복지학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI1106', 'FACI11', '도시부동산학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI5001', 'FACI50', '글로벌비즈니스전공');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI5002', 'FACI50', '글로벌IT전공');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI7401', 'FACI74', '생명시스템학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI7402', 'FACI74', '식품영양학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI7403', 'FACI74', '화학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI7404', 'FACI74', '수학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI7405', 'FACI74', '화공신소재공학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI7406', 'FACI74', '간호학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI7407', 'FACI74', '생활체육학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI7408', 'FACI74', '융합기술-경영학과');
insert into code(code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'FACI7409', 'FACI74', '광전자물리학과');

insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI90', 'FACI', '인문사회대학원');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI91', 'FACI', '자연대학원');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI92', 'FACI', '공학대학원');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI93', 'FACI', '예체능대학원');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI94', 'FACI', '사회문화행정복지대학원');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI95', 'FACI', '교육대학원');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI96', 'FACI', '경영-국방전략대학원');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI97', 'FACI', '학제신학대학원');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9001', 'FACI90', '국어국문학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9002', 'FACI90', '문예창작학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9003', 'FACI90', '영어영문학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9004', 'FACI90', '아동영어학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9005', 'FACI90', '일어일문학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9006', 'FACI90', '문헌정보학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9007', 'FACI90', '철학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9008', 'FACI90', '기독교학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9009', 'FACI90', '교육학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9010', 'FACI90', '국어교육학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9011', 'FACI90', '영어교육학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9012', 'FACI90', '사학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9013', 'FACI90', '경영학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9014', 'FACI90', '경제학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9015', 'FACI90', '회계학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9016', 'FACI90', '무역학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9017', 'FACI90', '경영정보학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9018', 'FACI90', '응용통계학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9019', 'FACI90', '컨벤션경영학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9020', 'FACI90', '법학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9021', 'FACI90', '행정학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9022', 'FACI90', '도시부동산학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9023', 'FACI90', '정치언론국제학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9024', 'FACI90', '사회복지학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9025', 'FACI90', '아동복지학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9026', 'FACI90', '범죄학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9101', 'FACI91', '수학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9102', 'FACI91', '화학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9103', 'FACI91', '생명시스템과학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9104', 'FACI91', '식품영양학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9105', 'FACI91', '수학교육과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9201', 'FACI92', '컴퓨터공학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9202', 'FACI92', '멀티미디어학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9203', 'FACI92', '건축공학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9204', 'FACI92', '건설시스템공학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9205', 'FACI92', '전자공학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9206', 'FACI92', '화공신소재공학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9207', 'FACI92', '정보통신학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9208', 'FACI92', '산업공학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9209', 'FACI92', '기계공학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9210', 'FACI92', '광센서공학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9211', 'FACI92', '무인시스템공학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9301', 'FACI93', '미술학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9302', 'FACI93', '체육학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9401', 'FACI94', '골프레저경영학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9402', 'FACI94', '공연예술학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9403', 'FACI94', '문예창작학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9404', 'FACI94', '사회복지학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9405', 'FACI94', '상담심리학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9406', 'FACI94', '아동복지학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9407', 'FACI94', '언론홍보광고학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9408', 'FACI94', '정보통계학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9409', 'FACI94', '조형미술학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9410', 'FACI94', '청소년지도학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9411', 'FACI94', '특허법무학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9412', 'FACI94', '한국전통복식학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9413', 'FACI94', '행정정책학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9414', 'FACI94', '항장미용학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9501', 'FACI95', '교육학전공');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9502', 'FACI95', '상담교육전공');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9503', 'FACI95', '국어교육전공');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9504', 'FACI95', '영어교육전공');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9505', 'FACI95', '역사교육전공');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9506', 'FACI95', '수학교육전공');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9507', 'FACI95', '체육교육전공');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9508', 'FACI95', '전산교육전공');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9509', 'FACI95', '미술교육전공');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9510', 'FACI95', '영양교육전공');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9511', 'FACI95', '한국어교육전공');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9601', 'FACI96', '안보국방정책학과');
INSERT INTO code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9602', 'FACI96', '국방획득-M&S학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9603', 'FACI96', 'MBA과정');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9701', 'FACI97', '목회신학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9702', 'FACI97', '기독교상담학과');
insert into code(code_id, code, code_super, code_name) 
values (code_ids.NEXTVAL, 'FACI9703', 'FACI97', '교회지도자과정');


insert into code (code_id, code, code_name) values (code_ids.NEXTVAL, 'POSI', '직업');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'POSI01', 'POSI', '학부생');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'POSI02', 'POSI', '대학원생');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'POSI03', 'POSI', '교직원');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'POSI04', 'POSI', '교수');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'POSI05', 'POSI', '시민');

insert into code (code_id, code, code_name) values (code_ids.NEXTVAL, 'MONE', '화폐종류');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'MONE01', 'MONE', '원');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'MONE02', 'MONE', '달러');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'MONE03', 'MONE', '엔');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'MONE04', 'MONE', '위안');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'MONE05', 'MONE', '유로');

insert into code (code_id, code, code_name) values (code_ids.NEXTVAL, 'BUTY', '예산');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BUTY01', 'BUTY', '국고보조비');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BUTY02', 'BUTY', '학교지원금');

insert into code (code_id, code, code_name) values (code_ids.NEXTVAL, 'ACST', '수서');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'ACST01', 'ACST', '수서등록');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'ACST02', 'ACST', '주문등록');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'ACST03', 'ACST', '검수등록');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'ACST04', 'ACST', '서지등록');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'ACST05', 'ACST', '입고등록');

insert into code (code_id, code, code_name) values (code_ids.NEXTVAL, 'BKTY', '책표지');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BKTY01', 'BKTY', '하드커버');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BKTY02', 'BKTY', '소프트커버');

insert into code (code_id, code, code_name) values (code_ids.NEXTVAL, 'BKST', '책상태');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BKST01', 'BKST', '대여가능');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BKST02', 'BKST', '대여');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BKST0200', 'BKST02', '예약불가');
insert into code (code_id, code, code_super, code_name) values (code_ids.NEXTVAL, 'BKST0201', 'BKST02', '예약가능');

insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '1Q84 1', '무라카미 하루키', '9788954608640', '양윤옥', 'BKTY01', 2, '문학동네', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '1Q84 2', '무라카미 하루키', '9788954608657', '양윤옥', 'BKTY01', 2, '문학동네', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '1Q84 3', '무라카미 하루키', '9788954611800', '양윤옥', 'BKTY01', 2, '문학동네', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '명견만리 : 향후 인류에게 가장 중요한 것들을 말하다', 'KBS 명견만리 제작팀 ', '9791186560167', '', 'BKTY02', 2, '인플루엔셜', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '기사단장 죽이기 1', '무라카미 하루키', '9788954646123', '홍은주', 'BKTY01', 2, '문학동네', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '기사단장 죽이기 2', '무라카미 하루키', '9788954646130', '홍은주', 'BKTY01', 2, '문학동네', 'BKST0201', 1);
INSERT INTO stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '잠 1', '베르나르 베르베르', '9788932918372', '전미연', 'BKTY01', 2, '열린책들', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '잠 2', '베르나르 베르베르', '9788932918389', '전미연', 'BKTY01', 2, '열린책들', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '언어의 온도', '이기주', '9791195522125', '', 'BKTY02', 2, '말글터', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '코스모스', '칼 세이건', '9788983711892', '홍승수', 'BKTY01', 2, '사이언스북스', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '오직 두 사람', '김영하', '9788954645614', '', 'BKTY02', 2, '문학동네', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type,  book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '보노보노처럼 살다니 다행이야', '김신회', '9791130611853', '', 'BKTY01', 2, '놀', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '매일 심리학 공부', '우리창', '9788952778888', '정세경', 'BKTY02', 2, '지식너머', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type,  book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '청춘의 독서', '유시민', '9788901218151', '', 'BKTY02', 2, '웅진지식하우스', 'BKST0200', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '나미야 잡화점의 기적', '히가시노 게이고', '9788972756194', '양윤옥', 'BKTY01', 2, '현대문학', 'BKST0200', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '호모 데우스', '유발 하라리', '9788934977841', '김명주', 'BKTY02', 2, '김영사', 'BKST0200', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '나는 나로 살기로 했다', '김수현', '9791187119845', '', 'BKTY02', 2, '마음의숲', 'BKST0200', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '바깥은 여름', '김애란', '9788954646079', '', 'BKTY02', 2, '문학동네', 'BKST0200', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '엔드 오브 왓치', '스티븐 킹', '9791158882969', '이은선', 'BKTY01', 2, '황금가지', 'BKST0200', 1);
INSERT INTO stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '위험한 비너스', '히가시노 게이고', '9788972758242', '양윤옥', 'BKTY02', 2, '현대문학', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type,  book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '꿀벌과 천둥', '온다 리쿠', '9788972758303', '김선영', 'BKTY01', 2, '현대문학', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type,  book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '82년생 김지영', '조남주', '9788937473135', '', 'BKTY02', 2, '민음사', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '인공지능 투자가 퀀트', '권용진', '9788998599362', '', 'BKTY01',  2, '카멜북스', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '셜록1 : 주홍색 연구', '아서 코난 도일', '9791188047154', '김나현', 'BKTY01', 1, '열림원', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '셜록2 : 바스커빌의 사냥개', '아서 코난 도일', '9791188047147', '김나현', 'BKTY01', 1, '열림원', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type,  book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '서툰 감정', '일자 샌드', '9791130613529', '김유미', 'BKTY02', 2, '다산3.0', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '논리학 대전 : 제1부 명사(名辭)에 대하여', '윌리엄 오캄', '9788930088817', '박우석', 'BKTY02', 2, '나남', 'BKST01', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '정신질환의 진단 및 통계편람', 'APA', '9788999700026', '권준수', 'BKTY02', 2, '학지사', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '경제학원론', '이준구', '9791185994048', '', 'BKTY01', 2, '문우사', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '공부 공부 : 자기를 돌보는 방법을 어떻게 배울 것인가', '엄기호', '9788998439361', '', 'BKTY02', 2, '따비', 'BKST01', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '우아한 거짓말', '김려령', '9788936456221', '', 'BKTY01',  2, '창비', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '더 나쁜 쪽으로', '김사과', '9788954646376', '', 'BKTY02', 1, '문학동네', 'BKST01', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '행복을 풀다 : 구글X 공학자가 찾은 삶과 죽음 너머 진실', '모 가댓', '9788947542142', '강주헌', 'BKTY02', 1, '한국경제신문사', 'BKST01', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '암흑의 시대 : 약탈과 착취, 폭력과 학살의 시대', '샤시 타루르', '9791196066635', '김성웅', 'BKTY02', 1, '젤리판다', 'BKST01', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '파리에서 한 달을 살다', '전혜인', '9791186173077', '', 'BKTY02', 1, '알비', 'BKST01', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type,  book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '노르웨이의 숲', '무라카미 하루키', '9788937434488', '양억관', 'BKTY01', 2, '민음사', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '우리는 가해자입니다 : 일본이 찾아낸 침략과 식민 지배의 기록', '아카하타신문 편집국', '9791187685142', '홍상현', 'BKTY01', 2, '정한책방', 'BKST01', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '홍차의 시간', '야마다 우타코', '9788959198849', '강소정', 'BKTY02', 2, '애니북스', 'BKST01', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '수박이 먹고 싶으면', '김장성', '9788998751234', '', 'BKTY01', 1, '이야기꽃', 'BKST01', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '끌리는 박물관', '매기 퍼거슨', '9788970845418', '김한영', 'BKTY02', 1, '예경', 'BKST01', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '육지 촌 부부 제주에서 내 집 짓고 살기', '최보윤', '9788998294359', '', 'BKTY01', 1, '더블엔', 'BKST01', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '도쿄 마실 : 지금은 도쿄에서 놀 시간', '정꽃보라', '9788952778628', '', 'BKTY01', 1, '시공사', 'BKST01', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '차마 하지 못했던 말 : ‘요즘 것’이 ‘요즘 것’들과 일하는 당신에게', '유소연', '9788998933227', '', 'BKTY02', 1, '이와우', 'BKST0200', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type,  book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '가족의 파산 : 장수가 부른 공멸', 'NHK 스페셜 제작팀', '9788972978824', '홍성민', 'BKTY01', 1, '동녘', 'BKST0201', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '디 엔드 : 과학과 종교가 재앙에 대해 말하는 것들', '필 토레스', '9788932318660', '제효영', 'BKTY01', 2, '현암사', 'BKST01', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type,  book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '홍세화의 공부', '홍세화', '9791159921162', '', 'BKTY01', 2, '알마', 'BKST01', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type,  book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '악의 해부 : 나치 전범들의 심리분석', '조엘 딤스데일', '9791185415154', '박경선', 'BKTY01', 2, '에이도스', 'BKST01', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type, book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '사악한 책 모비딕', '너새니얼 필브릭', '9791195772513', '홍한별', 'BKTY01', 2, '저녁의책', 'BKST01', 1);
insert into stackbooks(book_id, title, author, isbn, translator, book_type,  book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '빵을 끊어라 : 2주간 빵을 끊고 기적처럼 건강해진 글루텐프리 노하우', '포브스 야요이', '9791155427132', '노경아', 'BKTY01', 2, '매일경제신문사', 'BKST01', 1);
INSERT INTO stackbooks(book_id, title, author, isbn, translator, book_type,  book_copy, publisher, book_status, institution_id)
values(book_ids.NEXTVAL, '실용낭만 취미살이 : 직업 유목민 12인의 나답게 사는 법', '정원', '9791195981762', '', 'BKTY01', 2, '피그말리온', 'BKST01', 1);

INSERT INTO holdinginst (institution_id, institution_name, institution_assigned)
VALUES (INSTITUTION_IDS.NEXTVAL,'한남대학교 중앙도서관','INST0101');

INSERT INTO USERS (user_id, PASSWORD, user_name, user_email) 
VALUES ('dudwn960226', 'yj12345', '김영주', 'myodo2114@nate.com');
INSERT INTO USERS (user_id, PASSWORD, user_name, user_email) 
VALUES ('whddbs26', 'jy1004', '전종윤', 'jjy1004@naver.com');
INSERT INTO USERS (user_id, PASSWORD, user_name, user_email, user_grade) 
VALUES ('boram111', '123456rr', '신보람', 'boram2@nate.com', 'admin');
INSERT INTO USERS (user_id, PASSWORD, user_name, user_email) 
VALUES ('joo8353', '8353oo', '박주형', 'joo8353@gmail.com');

commit;