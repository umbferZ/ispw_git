<div class="col s6">
	<div class="card">
		<div class="card-image">
			<img src="images/strutture/carducci.jpg"> <span
				class="card-title red"
			>Struttura <%= request.getParameter("id") %></span>
		</div>
		<div class="card-content">
		<p></p>
			<p>I am a very simple card. I am good at containing small bits of
				information. I am convenient because I require little markup to use
				effectively.</p>
		</div>
		<div class="card-action">
			<div>
				<form method="post" action="">
					<input type="hidden" name="id" value="<%= request.getParameter("id") %>"/>
					<button class="btn amber darken-4" type="submit" name="action">
						aggiungi al carrallo</button>
				</form>
			</div>
<!-- 			<i class="material-icons right activator grey-text text-darken-4">more_vert</i> -->
		</div>
	</div>
</div>
