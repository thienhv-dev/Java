create database CCM
go

use CCM
create table Customer
(
	maKH char(6) primary key,
	hoTen nvarchar(50) not null,
	CMND int unique check(CMND>99999999 and CMND <1000000000),
	email varchar(200) not null
		check (Email like'[a-z]%@[a-z]%.com'),
	matKhau nvarchar(20)not null check(len(matKhau)>=3),
	stt nvarchar(200) null
)

create table CreaditCard
(
	maThe char(16) primary key,
	maKH char(6) foreign key references Customer(maKH),
	hanMuc decimal(18,0) not null,
	loaiThe varchar(15) not null,
	soDu decimal(18,0) not null,
	pin char(3) not null,
	ngayCap date default(getDate()),
	thangHetHan int check(thangHetHan between 1 and 12),
	namHetHan int check (namHetHan>=DatePart(month,getdate())),
	stt nvarchar(200) null,
)

create table TransLog
(
	logID int identity(1,1) primary key,
	maThe char(16) foreign key references CreaditCard(maThe),
	ngayGioGD datetime default(getDate()) not null,
	diaDiem nvarchar(200) not null,
	soTien decimal(18,0) not null,
	loaiGD char(2) not null default('TT') check(loaiGD in ('TT','NT','KT','MT','HM')),
	moTa nvarchar(200) null,
)

create table Level
(
	levID int primary key,
	hanMuc decimal(18,0) not null
)

insert into customer values('KH0001',N'Nguyễn Văn A','205959678','thanhvu8530@gmail.com','def','H')
insert into customer values('KH0002',N'Nguyễn Văn B','205959679','thanhvu8540@gmail.com','ghi','K')
insert into customer values('KH0003',N'Nguyễn Văn C','205959680','thanhvu8550g@gmail.com','jkl','L')


insert into CreaditCard (maThe,maKH,hanMuc,loaiThe,soDu,pin,thangHetHan,namHetHan)values('1234560987645364','KH0001',10000000,'visacard','500000','111','6','2016')
insert into CreaditCard (maThe,maKH,hanMuc,loaiThe,soDu,pin,thangHetHan,namHetHan)values('1234560987645344','KH0002',20000000,'mastercard','1000000','222','8','2016')
insert into CreaditCard (maThe,maKH,hanMuc,loaiThe,soDu,pin,thangHetHan,namHetHan)values('1234560987645354','KH0003',15000000,'mastercard','3000000','333','11','2016')


insert into TransLog(maThe,ngayGioGD,diaDiem,soTien,loaiGD,moTa) values('1234560987645364','2016-01-02 12:30:00.000',N'193 Nguyễn Lương Bằng','3000000','KT','')
insert into TransLog(maThe,ngayGioGD,diaDiem,soTien,loaiGD,moTa) values('1234560987645344','2016-01-02 8:42:00.000',N'78 Cao Thắng','500000','KT','')
insert into TransLog(maThe,ngayGioGD,diaDiem,soTien,loaiGD,moTa) values('1234560987645354','2016-01-02 9:55:00.000',N'126 Hàm Nghi','700000','MT','')

insert into Level(levID,hanMuc) values(1,10000000)
insert into Level(levID,hanMuc) values(2,15000000)
insert into Level(levID,hanMuc) values(3,20000000)
insert into Level(levID,hanMuc) values(4,50000000)

