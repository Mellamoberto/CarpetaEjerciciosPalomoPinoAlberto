package com.example.permisos

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng


class MainActivity4 : AppCompatActivity(), OnMapReadyCallback {
    private var googleMap: GoogleMap? = null
    private var fusedLocationProviderClient: FusedLocationProviderClient? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)

        val mapFragment: SupportMapFragment? = supportFragmentManager
            .findFragmentById(R.id.map) as? SupportMapFragment

        mapFragment?.getMapAsync(this)
    }

    override fun onMapReady(map: GoogleMap?) {
        googleMap = map
        if (checkLocationPermission()) {
            currentLocation()
        } else {
            requestLocationPermission()
        }
    }

    private fun checkLocationPermission(): Boolean {
        return ContextCompat.checkSelfPermission(
            this, Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED
    }

    private fun requestLocationPermission() {
        ActivityCompat.requestPermissions(
            this, arrayOf<String>(Manifest.permission.ACCESS_FINE_LOCATION),
            LOCATION_PERMISSION_REQUEST_CODE
        )
    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<String>, grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == LOCATION_PERMISSION_REQUEST_CODE) {
            if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                currentLocation()
            } else {
                Toast.makeText(this, "Permiso de ubicación denegado", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun currentLocation() {
        if (checkLocationPermission()) {
            fusedLocationProviderClient?.lastLocation
                ?.addOnSuccessListener(this) { location ->
                    if (location != null) {
                        val latitude: Double = location.latitude
                        val longitude: Double = location.longitude
                        val currentLatLng = LatLng(latitude, longitude)
                        googleMap?.moveCamera(
                            CameraUpdateFactory.newLatLngZoom(
                                currentLatLng,
                                15f
                            )
                        )
                    } else {
                        Toast.makeText(this, "Ubicación no disponible", Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }

    companion object {
        private const val LOCATION_PERMISSION_REQUEST_CODE = 1
    }
}

