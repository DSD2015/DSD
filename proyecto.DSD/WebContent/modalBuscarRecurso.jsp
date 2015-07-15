<div class="container">
    <div class="row">
        <div class="col-lg-4">
            <div class="form-group">
              <label for="perfil">Perfil:</label>
			  <select class="form-control" id="perfil">
			    <option>Analista</option>
			    <option>QA</option>
			  </select>
			</div>
        </div>
        <div class="col-lg-4">
            <div class="form-group">
              <label for="estado">Estado:</label>
			  <select class="form-control" id="estado">
			    <option>Activo</option>
			    <option>Inactivo</option>
			  </select>
			</div>  
        </div>
    </div>
    <div class="row">



        <div class="col-lg-4">
        	<label for="estado">Fecha Inicio:</label>
        	<div class='input-group date'>
                <input type='text' class="form-control" />
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </div>
        </div>
        <div class="col-lg-4">
        	<label for="estado">Fecha Fin:</label>
        	<div class='input-group date'>
                <input type='text' class="form-control" />
                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
            </div>
        </div>
	</div>
    <div class="row">
        <div class="col-lg-12">
            <button type="submit" class="btn btn-primary">Buscar</button>
        </div>
    </div>
    <div class="row margin-top-medium">
    	<div class="col-lg-8">
	        <table class="table">
	            <tr>
	                <th>Nombre</th>
	                <th>Sexo</th>
	                <th>Edad</th>
	                <th>Distrito</th>
	                <th>Seleccionar</th>
	            </tr>
	            <tr>
					<td>Sandra Wilcox </td>
					<td>Femenino </td>
					<td>23  </td>
					<td>Lima</td>
					<td><input type="radio" name="seleccinar"></td>
				</tr>
				<tr>
					<td>Yenny Chavez </td>
					<td>Femenino </td>
					<td>25  </td>
					<td>  San Miguel  </td>
					<td><input type="radio" name="seleccinar"></td>
				</tr>
				<tr>
					<td> Carmen Rojas </td>
					<td>Femenino </td>
					<td>26  </td>
					<td>San Isidro</td>
					<td><input type="radio" name="seleccinar"></td>
				</tr>
	        </table>
	    </div>
    </div>
    <div class="row">
        <div class="col-lg-12">
            <button  type="button" data-dismiss="modal" class="btn btn-primary">Seleccionar</button>
        </div>
    </div>
</div>