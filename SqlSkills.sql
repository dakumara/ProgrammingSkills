Select 	CONCAT_WS(" ", pe.GivenName, pe.FamilyName) AS Person_Name,
		YEAR(curdate()) - YEAR(pe.DateOfBirth) AS Age,
        pa.FatherName AS Father_Name, pa.MotherName AS Mother_Name
		FROM person AS pe 
		LEFT JOIN personparent AS pp ON pe.PersonID = pp.PersonID
		LEFT JOIN parent AS pa ON  pp.ParentID = pa.ParentID;
     