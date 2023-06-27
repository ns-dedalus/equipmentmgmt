-- Drop tables
/*
Drop table ApplicationUserRole CASCADE CONSTRAINTS;
Drop table ApplicationRole CASCADE CONSTRAINTS;
Drop table ApplicationUser CASCADE CONSTRAINTS;

Drop table EquipmentMovement CASCADE CONSTRAINTS;
Drop table Equipment CASCADE CONSTRAINTS;
Drop table ServicePoint CASCADE CONSTRAINTS;
Drop table LkStatus CASCADE CONSTRAINTS;
Drop table LkStatusType CASCADE CONSTRAINTS;
Drop table LkType CASCADE CONSTRAINTS;
Drop table LkTypeGroup CASCADE CONSTRAINTS;
*/

-- Default values

/*

Insert into ApplicationRole(ApplicationRoleId, ApplicationRoleName) values (1, 'User');

Insert into LkTypeGroup(TypeGroupId, TypeGroupName) values (1, 'EquipmentType');
Insert into LkType(TypeId, TypeGroupId, TypeName, TypeDisplayName) values (1, 1, 'OxygenCylinder', 'Oxygen cylinder');
Insert into LkType(TypeId, TypeGroupId, TypeName, TypeDisplayName) values (2, 1, 'BPMonitor', 'blood pressure monitor');
Insert into LkType(TypeId, TypeGroupId, TypeName, TypeDisplayName) values (3, 1, 'Ventilator', 'Ventilator');

Insert into LkStatusType(StatusTypeId, StatusTypeName) values (1, 'EqWorkingStatus');
Insert into LkStatus(StatusId, StatusTypeId, StatusName, StatusDisplayName) values (1, 1, 'Working', 'Working');
Insert into LkStatus(StatusId, StatusTypeId, StatusName, StatusDisplayName)  values (2, 1, 'NotWorking', 'Not working');

*/